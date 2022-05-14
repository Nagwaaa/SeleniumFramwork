package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends PageBase {

	public UserRegisterationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "gender-female")
	WebElement gender;
	
	@FindBy(id = "FirstName")
	WebElement fname;
	
	@FindBy(id = "LastName")
	WebElement lname;
	
	@FindBy(id = "Email")
	WebElement mail;
	
	@FindBy(id = "Password")
	WebElement pass;
	
	@FindBy(id = "ConfirmPassword")
	WebElement cpass;
	
	@FindBy(id = "register-button")
	WebElement btnReg;
	
	@FindBy(css = "div.result")
	public WebElement mes;
	
	public void UserCanRegister(String fn,String ln,String ma,String pas) {
		SetElements(fname, fn);
		SetElements(lname, ln);
		SetElements(mail, ma);
		SetElements(pass, pas);
		SetElements(cpass, pas);
		ClickElement(btnReg);
		
	}
}
