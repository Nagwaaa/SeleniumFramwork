package Tests;

import org.testng.annotations.Test;

import Pages.SearchAutocompletePage;

public class SearchAutoTest extends TestBase{
	
	
	SearchAutocompletePage sp;
	@Test
	public void UserSearchAutoComSuccess() throws InterruptedException {
		sp=new SearchAutocompletePage(driver);
		sp.UserCanSearchWithAutoComplete("app");
	}

}
