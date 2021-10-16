package rediff_tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import object_repository.Signin_email_page;
import rediff.LandingPage;
import rediff.PortfolioPage;
import rediff.SigninPage;

public class signin_createpf {
	
	@Test
	public void signin() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\testing\\chrome\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		
		LandingPage landingpage=new LandingPage(driver);
		
		PageFactory.initElements(driver, landingpage);
		
		SigninPage signinpage;
		signinpage=landingpage.SignInClick();
		// "kamath.s2020@rediffmail.com", "Welcome1$"
		signinpage.enteremail("shreyatikone99@gmail.com");
		signinpage.enterpassword("Shreya@2021");
		
		PortfolioPage pfpage;
		pfpage=signinpage.SignInClick();
		

		
	}

}
