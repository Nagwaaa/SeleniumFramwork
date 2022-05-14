package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "small-searchterms")
	WebElement searchInput;
	
	@FindBy(css = "button.button-1.search-box-button")
	WebElement searchBtn;
	
	public void UserCanSearch(String val) {
		SetElements(searchInput, val);
		ClickElement(searchBtn);
	}
	
	

}
