package javaPackage;

import org.testng.annotations.Test;

public class TestNG5 {
	@Test
	public void a()
	{
		System.out.println("hello a test method");
	}
	@Test(invocationCount=2,priority=-1,enabled=false & true)
	public void b()
	{
		System.out.println("hello b test method");
	}
	@Test(invocationCount=2)
	public void d()
	{
		System.out.println("Hello d test method");
	}
	

}
