package testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_xml {
	@Parameters({"URL"})
	@Test
	public void check_parameter(String pmt)
	{
System.out.println("run");
System.out.println(pmt);

}
}