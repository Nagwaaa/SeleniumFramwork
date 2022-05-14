package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pages.ContactUsPage;
import Pages.HomePage;

public class ContactUsTest extends TestBase{
	
		HomePage hp;
		ContactUsPage ct;
		
		@Test
		public void UserContactUsSuccessful() throws InterruptedException
		{
			hp=new HomePage(driver);
			ct=new ContactUsPage(driver);
			Thread.sleep(1000);
			hp.UserPressOnLastPage();
			
			hp.UserPressOnContactUsLink();
			
			ct.UserCanSendFromContactUs("Nagwa Ibrahim", "no147@mail.com", "this is my complane");
			assertEquals(ct.conMess.getText(),"Your enquiry has been successfully sent to the store owner.");
		}

}
