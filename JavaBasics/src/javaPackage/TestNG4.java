package javaPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;
//used to skip a test case if it is not ready to test
public class TestNG4 {
	@Test
	public void a()
	{
		System.out.println("a test method");
	}
    @Test(enabled=false)
    public void b()
	{
		System.out.println("b test method");
	}
    @Test(enabled=true)
    public void c()
	{
		System.out.println("c test method");
	}
    
    //invoked 2 times
    @Test(invocationCount=2)
    public void e()
	{
		System.out.println("e test method");
	}
    
    //invoked 0 times or skipping the test case
    @Test(invocationCount=0)
    public void f()
	{
		System.out.println("b test method");
	}
    
    //conditional skipping by throwing SkipException
    @Test(enabled=false)
    public void g()
	{
		System.out.println("g test method");
		throw new SkipException("skipping f test method");
	}
}
