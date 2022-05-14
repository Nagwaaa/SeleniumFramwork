package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginPage extends PageBase {

	public UserLoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "Email")
	WebElement mail;
	
	@FindBy(id = "Password")
	WebElement pas;
	
	@FindBy(css = "button.button-1.login-button")
	WebElement loginbtn;
	
	public void UserCanLogin(String m,String p) {
		SetElements(mail, m);
		SetElements(pas, p);
		ClickElement(loginbtn);
		
	}

}
