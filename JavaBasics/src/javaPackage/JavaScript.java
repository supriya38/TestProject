package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supriya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='abc@gmail.com'");

		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)");
		
		
		
	}

}
