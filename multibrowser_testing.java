package testing;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multibrowser_testing {
	public WebDriver driver;
	@Parameters("browser")
    @BeforeClass
    public void beforeTest(String browser)
    {
		if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","D:\\testing\\ms\\msedgedriver.exe");
		 driver = new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\testing\\chrome\\chromedriver.exe");	
		driver = new ChromeDriver();
		}
		driver.get("https://www.google.com");
    }
	@Test
	public void login()throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
	}
	@AfterClass
	public void afterTest()
	{
		driver.quit();
	}
}
