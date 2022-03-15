package actiTime;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyWords {
	
	@BeforeClass 
	public void beforeClass() 
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	
	@Test(enabled =false)
	public void test_B()
	{
		System.out.println("test@bbb");
	}
	@Test(priority=0)
	public void test_A()
	{
		System.out.println("test@@aaa");
	}
	@Test(invocationCount=2,priority=1)
	public void test_D()
	{
		System.out.println("test@ddd");
	}
	@Test(dependsOnMethods= {"test_D"})
	public void test_C()
	{
		System.out.println("test@cccc");
	}
	@Test(timeOut=2000)
	public void test_M() throws InterruptedException
	{
		System.out.println("@mmm");
//		Thread.sleep(5000);
	}
	@Test(priority=3,dependsOnMethods= {"test_A"})
	public void test_P()
	{
		System.out.println("@ppp");
	}
	@AfterMethod 
	public void afterMethod()  
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}

}
