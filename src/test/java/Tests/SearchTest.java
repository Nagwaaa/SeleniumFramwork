package Tests;

import org.testng.annotations.Test;

import Pages.SearchPage;

public class SearchTest extends TestBase{

	SearchPage sp;
	
	@Test
	public void UserCanSearchSuccessfully() throws InterruptedException {
		sp=new SearchPage(driver) ;
		sp.UserCanSearch("Apple MacBook Pro 13-inch");
		Thread.sleep(2000);
	}
}
