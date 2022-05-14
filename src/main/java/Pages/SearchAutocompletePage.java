package Pages;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchAutocompletePage extends PageBase{

	public SearchAutocompletePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "small-searchterms")
	WebElement searchInput;
	
	@FindBy(className = "ui-menu-item-wrapper")
    List<WebElement>elements;
	
	public void UserCanSearchWithAutoComplete(String val) throws InterruptedException {
		
		SetElements(searchInput, val);
		Thread.sleep(1000);
		elements.get(0).click();
		System.out.println(elements.getClass());
	}
}
