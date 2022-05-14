package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageBase{

	protected WebDriver driver;
	public JavascriptExecutor jse;
	
	public HomePage(WebDriver driver) {
		super(driver);
		jse=(JavascriptExecutor)driver;
	}
	
	@FindBy(linkText = "Register")
	WebElement reg;
	
	@FindBy(linkText = "Log in")
	WebElement log;
	
	@FindBy(linkText = "Log out")
	WebElement exit;
	
	@FindBy(linkText = "My account")
	WebElement acc;
	
	@FindBy(linkText = "Change password")
	WebElement changep;
	
	@FindBy(linkText = "Contact us")
	WebElement contact;
	
	public void UserPressOnRegisterLink() {
		ClickElement(reg);
	}
	
	public void UserPressOnChangePasswordLink() {
		ClickElement(changep);
	}
	
	public void UserPressOnContactUsLink() {
		ClickElement(contact);
	}
	
	
	public void UserPressOnMyAccountLink() {
		ClickElement(acc);
	}
	
	public void UserPressOnLogOutLink() {
		ClickElement(exit);
	}
	
	public void UserPressOnLoginLink() {
		ClickElement(log);
	}
	
	public void UserPressOnXLink() {
		ClickElement(log);
	}
	
	public void UserPressOnLastPage() {
		
		jse.executeScript("window.scrollBy(0,2500)");
	}


}
