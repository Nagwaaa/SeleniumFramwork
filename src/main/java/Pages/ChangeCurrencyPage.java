package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ChangeCurrencyPage extends PageBase{

	Select sel;
	public ChangeCurrencyPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id = "customerCurrency")
	WebElement curr;
	
	public void UserChangeCurrency()
	{
		sel=new Select(curr);
		sel.selectByVisibleText("Euro");
	}

}
