package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.SearchPage;
import Pages.SendProductEmailPage;
import Pages.UserRegisterationPage;

public class SendProductEmailTest extends TestBase {
	
	
	
	SearchPage sp;
	SendProductEmailPage spp;
	HomePage homepage;
	UserRegisterationPage registerpage;
	
	@Test (priority = 2)
	public void UserCanSendSuccessful() throws InterruptedException {
		sp=new SearchPage(driver);
		spp=new SendProductEmailPage(driver);
		
		sp.UserCanSearch("Apple MacBook Pro 13-inch");
		Thread.sleep(1000);
		spp.UserPressOnShopCard();
		Thread.sleep(1000);
		spp.UserPressOnEmailFriend();
		spp.UserCanSendEmail("nogaaa@mail.com", "Goooooooooooooooooood");
		assertEquals(spp.Amess.getText(),"Your message has been sent.");
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void UserRegiserSuccessfully() {
		homepage=new HomePage(driver);
		registerpage=new UserRegisterationPage(driver);
		
		homepage.UserPressOnRegisterLink();
		registerpage.UserCanRegister("Nagwa","Ibrahim","nog19@mail.com","123456");
		assertEquals(registerpage.mes.getText(), "Your registration completed");
		
	}

}
