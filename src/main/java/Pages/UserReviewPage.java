package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserReviewPage extends PageBase{

	public UserReviewPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "AddProductReview_Title")
	WebElement title;
	
	@FindBy(id = "AddProductReview_ReviewText")
	WebElement mes;
	
	@FindBy(id = "addproductrating_3")
	WebElement rat;
	
	@FindBy(name = "add-review")
	WebElement BtnRevie;
	
	@FindBy(linkText = "Add your review")
	WebElement revLink;
	
	public void UserCanWriteReview(String tit,String ms) {
		SetElements(title, tit);
		SetElements(mes, ms);
		ClickElement(rat);
		ClickElement(BtnRevie);
		
	}
	
	public void PerssOnReviewLink() {
		ClickElement(revLink);
	}

}
