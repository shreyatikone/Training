package testing;

import org.testng.annotations.Test;

public class Paralleltests {
	@Test
	public void A_TestMethod() {
		long id = Thread.currentThread().getId();
		System.out.println("A_TestMethod. Thread id is: " + id);
	
}
	@Test
	public void B_TestMethod() {
		long id = Thread.currentThread().getId();
		System.out.println("B_TestMethod. Thread id is: " + id);
	}
	@Test
	public void C_TestMethod() {
		long id = Thread.currentThread().getId();
		System.out.println("C_TestMethod. Thread id is: " + id);
	}
	@Test
	public void D_TestMethod() {
		long id = Thread.currentThread().getId();
		System.out.println("D_TestMethod. Thread id is: " + id);
	}
	
	
	
	
	
	
	
}