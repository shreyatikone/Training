package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Unable_page {
	
	WebDriver localdriver;


	public Signin_Unable_page(WebDriver driver)
	{
		this.localdriver = driver;
		
	}
	
	@FindBy(linkText="Terms")
	public WebElement linkTerms;
	

	
	public void clickTerms() {
		linkTerms.click();
	}
	
}
