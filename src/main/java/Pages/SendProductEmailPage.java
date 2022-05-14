package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendProductEmailPage extends PageBase{

	public SendProductEmailPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "FriendEmail")
	WebElement mail;
	
	@FindBy(id = "PersonalMessage")
	WebElement mess;
	
	@FindBy(name = "send-email")
	WebElement btnSend;
	
	@FindBy(css = "button.button-2.product-box-add-to-cart-button")
	WebElement CardBtn;
	
	@FindBy(css = "button.button-2.email-a-friend-button")
	WebElement mailBtn;
	
	@FindBy(css = "div.result")
	public WebElement Amess;
	
	public void UserCanSendEmail(String fmal,String ms) {
		
		SetElements(mail, fmal);
		SetElements(mess, ms);
		ClickElement(btnSend);
		
	}
	
	public void UserPressOnShopCard() {
		ClickElement(CardBtn);
	}
	
	public void UserPressOnEmailFriend() {
		ClickElement(mailBtn);
	}

}
