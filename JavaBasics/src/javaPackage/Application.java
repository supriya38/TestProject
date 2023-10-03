package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application 
{

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supriya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		//launching edge browser instance
		WebDriver driver=new ChromeDriver();

		//open URL using get()method
		driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();	
		 //driver.findElement(By.cssSelector("a[href='https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjkyNzIwNzU1LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&ars=facebook_login']"));
		 driver.findElement(By.xpath("//a[normalize-space()='Forgotten password?']"));
	}	 
	}


