package javaPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supriya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		
		//
		Thread.sleep(2000);
		driver.findElement(By.id("tabButton")).click();
		
		
         // get the total no of tabs
		Set<String> allWindowsId=driver.getWindowHandles();
		System.out.println(allWindowsId);
		
		Iterator<String> abc= allWindowsId.iterator();
		String s1=abc.next();
		String s2=abc.next();
		
		//Print the title of parent window
          driver.switchTo().window(s1);
         System.out.println("parent window id"+s1);
         System.out.println(driver.getTitle());

       Thread.sleep(2000);
      driver.switchTo().window(s2);
     Thread.sleep(2000);
System.out.println("child window id"+s2);
System.out.println(driver.getCurrentUrl());


  //step2 Window Popup handling
Thread.sleep(2000);
driver.switchTo().window(s1);
Thread.sleep(2000);
driver.findElement(By.id("windowButton")).click();

//print the titleof child window
Set<String> allWindowsId2=driver.getWindowHandles();
System.out.println(allWindowsId2);
Iterator<String> xyz= allWindowsId.iterator();
String b1=xyz.next();
String b2=xyz.next();
driver.switchTo().window(b1);
System.out.println("parent window id"+b1);//Id of child window
System.out.println(driver.getTitle());//title of child
System.out.println(driver.getCurrentUrl());//URL of child
driver.close();
System.out.println("Window and tab popup handled");



	}

}
