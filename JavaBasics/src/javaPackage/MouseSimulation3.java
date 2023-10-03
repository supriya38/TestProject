package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) throws Exception {
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supriya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

				WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get("https://jqueryui.com/droppable/");
				
				//Switching Frame
				driver.switchTo().frame(0);
				System.out.println("Switchwd to frame");
				
				//draggable web element
				WebElement  drag=driver.findElement(By.id("draggable"));
				
				//Drag and drop using Action class
				Thread.sleep(2000);
				Actions act=new Actions(driver);
				act.dragAndDropBy(drag, 100,60).build().perform();
				
				//Drang the webelement and click and hold using coordinaters
				Thread.sleep(2000);
				act.clickAndHold(drag).dragAndDropBy(drag, 100, 60).build().perform();
				
				

	}

}
