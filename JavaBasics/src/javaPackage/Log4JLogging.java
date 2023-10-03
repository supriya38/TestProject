package javaPackage;
 import java.util.concurrent.TimeUnit;
 import org.apache.log4j.Logger;
 import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4JLogging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger1=Logger.getLogger("Log4JLogging");
	
	//Configure log4j properties file
	PropertyConfigurator.configure("C:\\Users\\Supriya\\eclipse-workspace\\JavaBasics\\Repository\\log4j.properties");
	
	//open browser instance
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supriya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	logger1.info("Chrome Browser Instance Opened");
	
	//Maximize the window
    driver.manage().window().maximize();
    logger1.info("window Maximized");
    
    //Implicit wait
   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   logger1.info("Implicit wait Given");
   
   //Open URL
   driver.get("https://www.facebook.com/");
   logger1.info("Application Opened");
	
	//Check if the webelement is displayed or not
   try {
	driver.findElement(By.id("emails")).isDisplayed();
	   logger1.info("webelement is displayed");
} catch (Exception e) {
	// TODO Auto-generated catch block
	logger1.info("Failure 'emails ' web element is not displayed");
}

	}

}
