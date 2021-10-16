package rediff_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class MoneyPage extends PageBaseClass {



	public MoneyPage(WebDriver driver) {
		super(driver);

	}

	
	
	@FindBy(xpath = "//*[@id='signin_info']/a[1]")
	public WebElement signinLink;

	public PortFolioLoginPage clickSingInLink() {

		signinLink.click();

		PortFolioLoginPage portfolioLogin = new PortFolioLoginPage(driver);
		PageFactory.initElements(driver, portfolioLogin);
		return portfolioLogin;
	}

}
