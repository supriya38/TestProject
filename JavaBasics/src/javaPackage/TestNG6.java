package javaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG6 {
	
	@Test
	public void z()
	{
		Assert.assertTrue(3>12);
		System.out.println("hello z method");
	}
	@Test(dependsOnMethods="z")
	public void b()
	{
		System.out.println("hello b method");
	}
	

}
