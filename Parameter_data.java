package testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameter_data {
	@Test(dataProvider="search provider")
	public void testMethod (String name,String state)throws InterruptedException{
	System.out.println("welcome->"+name+";he is from->"+state);
	
	}


@DataProvider(name="search provider")
public Object[][] getDataFromDataProvider()
{
	return new Object[][]
			{
		{"abc","Maharashtra"},
		{"def","Gujrat"},
		{"stu","Uttar Pradesh"}
			};
}
}