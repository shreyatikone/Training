package rediff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {


	WebDriver localdriver;
	public SigninPage (WebDriver driver)
	{
		this.localdriver = driver;
	}
	
	@FindBy(xpath="//input[@id='useremail']")
	public WebElement emailtextbox;
	//driver.findElement(by.....
	
	@FindBy(xpath="//input[@id='userpass']")
	public WebElement passwordtextbox;
	
	@FindBy(xpath="//input[@id='loginsubmit']")
	public WebElement submitbutton;
	
	public void enteremail(String emailid) {
		emailtextbox.sendKeys(emailid);
	}

	public void enterpassword(String password) {
		passwordtextbox.sendKeys(password);
	}
	
	public PortfolioPage SignInClick() {
		submitbutton.click();
		
		PortfolioPage pfpage = new PortfolioPage(localdriver);
		PageFactory.initElements(localdriver, pfpage);
		return pfpage;
	}
	
}
