package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supriya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//*[@id=\"app\"]/header/div/div[2]/div")).click();
		
		//find the total no. of frames present
		int allFrames=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frames"+allFrames);
		
		//Go inside each frame and check if the element is present
		for(int i=0;i<allFrames;i++)
		{
			driver.switchTo().frame(i);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div/div/div[2]")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div/div/div[1]/div")).click();
			
		}
		
		
	}

}
