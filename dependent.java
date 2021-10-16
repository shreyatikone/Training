package testing;

import org.testng.annotations.Test;

public class dependent {
	@Test(dependsOnMethods={"cmethod","zmethod"})
	public void smethod() {
	System.out.println("s method depends on c method-d method");}
	@Test
	public void dmethod()
	{
	System.out.println("d method");
	}
	@Test
	public void zmethod()
	{
	System.out.println("z method");

	}
	@Test
	public void cmethod()
	{
	System.out.println("c method");
	}
	@Test(enabled=false)
	public void thod()
	{
	System.out.println("not run");
	}
	
}
