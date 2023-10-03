package javaPackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args)throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supriya\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver. manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");

       //Thread.sleep(2000);
     // driver.findElement(By.xpath("//a contains[@id,'u_0_0_IT\']")).click();

       //1st Way
        Thread.sleep(2000);
        driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]"));
        Thread.sleep(2000);
        driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]"));
        
        //2nd Way
        List<WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("Total Radio Buttons" + radios.size());
        System.out.println(radios.get(0).isSelected());
        System.out.println(radios.get(1).isEnabled());
        System.out.println(radios.get(2).isDisplayed());
        Thread.sleep(2000);
        radios.get(1).click();
        Thread.sleep(2000);
        System.out.println(radios.get(2).isSelected());
        
        
        /*3rd Way
        List<WebElement> radios1=driver.findElements(By.xpath("//*[@id=\"u_2_o_lN\"]/span[3]/label"));
      System.out.println("Total radio Buttons are:" +radios1.size());
      String expResult="Female";
      for(int i=0;i<radios1.size(); i++)
      {
        if(radios1.get(i).getText().equalsIgnoreCase(expResult))
        {
        	radios1.get(i).click();
        	System.out.println(expResult+ "Clicked");
        	break;*/
        }
      
	}


