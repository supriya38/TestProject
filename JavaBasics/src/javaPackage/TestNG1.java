package javaPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test
	
	public void a2() {
		
		System.out.println("hello a2 method");
		
	}

	
@BeforeTest
	
	public void b() {
		
		System.out.println("hello b method");
		
	}
@BeforeSuite

public void c() {
	
	System.out.println("hello c method");
	
}
@AfterMethod
	
	public void d() {
		
		System.out.println("hello d method");
	}
@BeforeClass

public void e() {
	
	System.out.println("hello  method e");
}

@AfterTest
public void h()
{
	System.out.println("test h");
}
@AfterClass

public void i() {
	
	System.out.println("hello  method i");
}
@BeforeMethod

public void j() {
	
	System.out.println("hello j method");
}
@AfterSuite

public void k() {
	
	System.out.println("hello k method");
	
}
@Test
public void a1()
{
	System.out.println(" hello a1 method");
}

}
