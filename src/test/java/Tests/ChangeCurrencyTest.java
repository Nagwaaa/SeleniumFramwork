package Tests;

import org.testng.annotations.Test;

import Pages.ChangeCurrencyPage;

public class ChangeCurrencyTest extends TestBase{

	ChangeCurrencyPage chp;
	
	@Test
	public void UserChangeCurrencyToEuro() throws InterruptedException {
		
		chp=new ChangeCurrencyPage(driver);
		chp.UserChangeCurrency();
		Thread.sleep(1000);
	}
}
