package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	
	protected WebDriver driver;
	
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SetElements(WebElement ele,String val) {
		ele.sendKeys(val);
	}
	
	public void ClickElement(WebElement ele) {
		ele.click();
	}
}
