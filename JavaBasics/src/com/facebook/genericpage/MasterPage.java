package com.facebook.genericpage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class MasterPage {
 public static WebDriver driver;
 public Properties prop;
 public Properties or;
 public Properties td;
 
 //Constructor Implementation
 public MasterPage() throws Exception
 {
	 //Configuration properties file implementation
	 FileInputStream ip=new FileInputStream(".\\src\\com\\facebook\\repsitory\\configuration.properties");
	 prop=new Properties();
	 prop.load(ip);
	 
	 //locators properties file implementation
	 FileInputStream fs=new FileInputStream(".\\src\\com\\facebook\\repsitory\\locators.properties");
	 or=new Properties();
	 or.load(fs);
	 
	//testdata properties file implementation
		 FileInputStream ms=new FileInputStream(".\\src\\com\\facebook\\repsitory\\testdata.properties");
		 td=new Properties();
		 td.load(ms);
		 
		 if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			 WebDriverManager.chromedriver
		 {
			 
		 }
 }
}
