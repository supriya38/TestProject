package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class OpenApplication {

	public static void main(String[] args) throws Exception
	{
		
		//setting the property to edgedriver and setting the path to the chrome driver
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supriya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

//launching edge browser instance
WebDriver driver=new ChromeDriver();

//open URL using get()method
driver.get("https://www.google.com/gmail/about/");

//maximize the Window
Thread.sleep(2000);
driver.manage().window().maximize();
 
Thread.sleep(2000);
driver.findElement(By.xpath("//body/header[1]/div[1]/div[1]/div[1]/a[3]")).click();
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Supriya");
driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kakade");
driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
	}

}
