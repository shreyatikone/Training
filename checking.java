package testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class checking {
	@Test
	
	public void pass()
	{
		System.out.println("test is pass");

	}
	@Test
public void fail()
{
System.out.println("test is fail");		
}
	@BeforeTest
	public void before1()
	
{
		System.out.println("before");
}
	@AfterTest
	public void after1()
	
	{
			System.out.println("after");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass1");
	}
	@AfterClass
	public void afterclass()
	
	{
			System.out.println("afterclass1");
	}
	
	@Test(groups="smoke")
	public void checkinggrp()
	{
	System.out.println("grouping");
	
	}
}
