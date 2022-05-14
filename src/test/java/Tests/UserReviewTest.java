package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.SearchPage;
import Pages.SendProductEmailPage;
import Pages.UserRegisterationPage;
import Pages.UserReviewPage;

public class UserReviewTest extends TestBase {
	
	
	UserReviewPage rp;
	UserRegisterationPage rsp;
	SearchPage sp;
	HomePage homepage;
	SendProductEmailPage send;
	
	@Test
	public void UserCanWriteReviewSuccessfuly() throws InterruptedException {
		rp=new UserReviewPage(driver);
		rsp=new UserRegisterationPage(driver);
		sp=new SearchPage(driver);
		homepage=new HomePage(driver);
		
		
		homepage.UserPressOnRegisterLink();
		rsp.UserCanRegister("Nagwa", "ibrahim", "nog14@mail.com", "123456");
		
		sp.UserCanSearch("Apple MacBook Pro 13-inch");
		
		send = new SendProductEmailPage(driver);
		send.UserPressOnShopCard();
		
		Thread.sleep(1000);
		rp.PerssOnReviewLink();
		rp.UserCanWriteReview("Labtop Review", "this is an amazing labtop");
		
	}

}
