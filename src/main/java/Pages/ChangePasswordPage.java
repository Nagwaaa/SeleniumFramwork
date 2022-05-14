package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends PageBase{

	public ChangePasswordPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id = "OldPassword")
	WebElement oldp;
	
	@FindBy(id = "NewPassword")
	WebElement newp;
	
	@FindBy(id = "ConfirmNewPassword")
	WebElement cnewp;
	
	@FindBy(css = "button.button-1.change-password-button")
	WebElement changbtn;
	
	@FindBy(css = "span.close")
	WebElement clos;
	
	public void UserCanChangePassword(String old,String np) {
		
		SetElements(oldp, old);
		SetElements(newp, np);
		SetElements(cnewp, np);
		ClickElement(changbtn);
		
	}
	public void Closex() {
		ClickElement(clos);
	}
	
	

}
