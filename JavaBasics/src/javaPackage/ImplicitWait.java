package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supriya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");
		 Thread.sleep(2000);
		 
		 //Implicit wait
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("how stuff works");
		 
	}

}
