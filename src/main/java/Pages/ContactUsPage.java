package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase{

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "FullName")
	WebElement fulname;
	
	@FindBy(id = "Email")
	WebElement mail;

	@FindBy(id = "Enquiry")
	WebElement Enq;
	
	@FindBy(name = "send-email")
	WebElement sendBtn;
	
	@FindBy(css = "div.result")
	public WebElement conMess;
	
	public void UserCanSendFromContactUs(String name,String ma,String qury) {
		
		SetElements(fulname,name);
		SetElements(mail, ma);
		SetElements(Enq, qury);
		ClickElement(sendBtn);
	}


}
