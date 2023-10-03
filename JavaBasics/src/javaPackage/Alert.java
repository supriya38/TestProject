package javaPackage;

import java.util.concurrent.TimeUnit;
import java.lang.AssertionError;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supriya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		//alert handling
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton"));
		Thread.sleep(2000);
		
		//Verify Alert Text
		String alertText=driver.switchTo().alert().getText();
		String expAlertText="Do you confirm action";
		Assert.assertEqual(alertText,expAlertText);
		
		

	}

}
