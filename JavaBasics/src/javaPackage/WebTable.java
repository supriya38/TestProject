package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supriya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
	//find rows in table
		int companies = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();
		System.out.println("Total companies:"+companies);//2019
		
		//find Columns in Table
		int Cols=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th")).size();
		System.out.println("Total columns or Headers in Table:"+Cols);//5
		
		
		
		 //find the specific row column data
		 
		 List<WebElement> value = driver.findElements(By.xpath("//table[@id=\"leftcontainer\"]/table/tbody/tr/td[1]/a"));
		 System.out.println("The value is:" +value);
		 
		 driver.quit();
/*List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]")) ;
System.out.println("Total companies Count:" + allCompanies.size());*/
	}

}
