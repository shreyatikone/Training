package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class asserf {
	@Test
	public void fail()
	{
	String act = "Gooooogle - Wrong string";
	System.out.println("Below assert would fail - ");
	Assert.assertEquals(act, "Google");
}
}
