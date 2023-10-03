package javaPackage;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
		//specify the location of properties file
		File src1= new File("C:\\Users\\Supriya\\eclipse-workspace\\JavaBasics\\Repository\\config.properties");
		File src2= new File("C:\\Users\\Supriya\\eclipse-workspace\\JavaBasics\\Repository\\locators.properties");
		File src3= new File("C:\\Users\\Supriya\\eclipse-workspace\\JavaBasics\\Repository\\testdata.properties");
		
		//Creat file inputstram class object to load the file
		FileInputStream fis1=new FileInputStream(src1);
		FileInputStream fis2=new FileInputStream(src2);
		FileInputStream fis3=new FileInputStream(src3);

        //Create properties class object to read properties file
		Properties pro= new Properties();
		pro.load(fis1);
		Properties pro2= new Properties();
		pro2.load(fis2);
		Properties pro3= new Properties();
		pro3.load(fis3);
		
		//setting the property of chrome browser and passing chromrdriver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supriya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get(pro.getProperty("URL"));

        //getProperty method will accept key and return value of that key
        driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
        driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));
        Thread.sleep(2000);
        driver.close();
        
	}

}
