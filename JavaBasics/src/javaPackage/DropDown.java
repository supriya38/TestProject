package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception{
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
		driver.findElement(By.xpath("//*[@id='collectNameNext']")).click();
		
		//1st way
		WebElement birthMonth = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select dropdown1 = new Select(birthMonth);
		dropdown1.selectByVisibleText("June"); // Replace with the text of the option you want to select


		
		//System.out.println("Total Dropdown values:-"+birthMonth.size());
		//birthMonth.get(3).click();
		
		//2nd Way
		WebElement bm =driver.findElement(By.xpath("//select [contains(@id,'month')]"));
		Select month=new Select(bm);
		Thread.sleep(2000);
		month.selectByVisibleText("April");
		Thread.sleep(2000);
		month.selectByValue("12");
		Thread.sleep(2000);
		month.selectByIndex(5);
		System.out.println(month.getFirstSelectedOption().getText());

		//3rd Way
		List <WebElement> dropdown=month.getOptions();
		for(int i=0;i<dropdown.size(); i++)
		{
			if(dropdown.get(i).getText().equalsIgnoreCase("August"))
			{dropdown.get(i).click();
			}
			}
		
		//4th Way
		bm.sendKeys("June");
		
		//5th Way
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("March");
		
		}
		
		
		
		
	}


