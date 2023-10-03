package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSemulation {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supriya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(2000);
        //create Electronics webelement ref.
		WebElement electro= driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		//mouse simulation using action class
		Actions act=new Actions(driver);
		
		// mouse hover to electronics
		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();
		
		//Keybord operations
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement fashion= driver.findElement(By.xpath("//*[text()='Fashion']"));
		Thread.sleep(2000);
		act.sendKeys(fashion,Keys.ENTER).build().perform();
		System.out.println("Fashion option Clicked");
		
		
		//Right click on the page
		Thread.sleep(2000);
		act.contextClick().build().perform();
		
	}

}
