package rediff_testcases;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import rediff_pages.LandingPage;
import rediff_pages.MoneyPage;
import rediff_pages.MyPorfolioPage;
import rediff_pages.PortFolioLoginPage;
import rediff_pages.BaseTestClass;
import rediff_pages.PageBaseClass;

public class MyPorfolioTest extends BaseTestClass{
	
	LandingPage landingPage;
	MoneyPage moneyPage;
	PortFolioLoginPage portfolioLoginPage;
	MyPorfolioPage myporfolioPage;
	
//	@Test
	public void openPorfolio(){
		
		
		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		moneyPage =landingPage.clickMoneyLink();
		portfolioLoginPage = moneyPage.clickSingInLink();
		myporfolioPage = portfolioLoginPage.doLogin("shreyatikone99@gmail.com", "Shreya@2021");
		//myporfolioPage.verifyMoneyBiz();
		//myporfolioPage.getTitle("Rediff Moneywiz | My Portfolio(s)");
			}
	
	//@Test(dataProvider="verifyLoginTestData", groups={"Regression", "LoginTest" })
	public void verifyLogin(){
		
		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		moneyPage =landingPage.clickMoneyLink();
		portfolioLoginPage = moneyPage.clickSingInLink();
		portfolioLoginPage.enterUser("shreyatikone99@gmail.com");
		portfolioLoginPage.submitUserName();
		//below one line added - 5th may 2021
		//portfolioLoginPage.enterPassword(testData.get("Password"));
		portfolioLoginPage.verifyPasswordField();
		
	}
	
	@Test
	public void addPortfolioTest(){

		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		moneyPage =landingPage.clickMoneyLink();
		portfolioLoginPage = moneyPage.clickSingInLink();
		myporfolioPage = portfolioLoginPage.doLogin("shreyatikone99@gmail.com", "Shreya@2021");
		myporfolioPage.verifyMoneyBiz();
		myporfolioPage.clickCreatePortfolio();
		waitForPageLoad();
		myporfolioPage.enterPortfolioName("New Portfolio-13oct2021");
		myporfolioPage = myporfolioPage.submitPortfolio();
		waitForPageLoad();
		myporfolioPage.isPorfolioExists("New Portfolio-13oct2021");
	}
	
	
	
	public void deletePortfolio(){
		System.out.println("In Delete portfolio - starting");
		
		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		moneyPage =landingPage.clickMoneyLink();
		portfolioLoginPage = moneyPage.clickSingInLink();
		myporfolioPage = portfolioLoginPage.doLogin("shreyatikone99@gmail.com", "Shreya@2021");
		waitForPageLoad();
		myporfolioPage.verifyMoneyBiz();
		myporfolioPage = myporfolioPage.selectPortfolio("New Portfolio");
		myporfolioPage = myporfolioPage.deletePortFolio();
		waitForPageLoad();
		myporfolioPage.isPorfolioDeleted("New Portfolio");
		System.out.println("In Delete portfolio - Ending");
	}
	


}
