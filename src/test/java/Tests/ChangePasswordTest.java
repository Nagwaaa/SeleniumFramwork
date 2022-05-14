package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Pages.ChangePasswordPage;
import Pages.HomePage;
import Pages.UserLoginPage;
import Pages.UserRegisterationPage;

public class ChangePasswordTest extends TestBase{
	
	
	HomePage homepage;
	UserRegisterationPage registerpage;
	UserLoginPage loginpage;
	ChangePasswordPage cp;
	
	Faker fak=new Faker();
	String fname=fak.name().firstName();
	String lname=fak.name().lastName();
	String mail=fak.internet().emailAddress();
	String pas=fak.number().digits(6).toString();
	
	
	@Test(priority = 1)
	public void UserRegiserSuccessfully() throws InterruptedException {
		
		loginpage=new UserLoginPage(driver);
		homepage=new HomePage(driver);
		registerpage=new UserRegisterationPage(driver);
		
		homepage.UserPressOnRegisterLink();
		registerpage.UserCanRegister(fname, lname, mail, pas);
		assertEquals(registerpage.mes.getText(), "Your registration completed");
	}
	
	@Test(priority = 2)
	public void UserChangePassword() throws InterruptedException {
		
		homepage=new HomePage(driver);
		cp=new ChangePasswordPage(driver);
		homepage.UserPressOnMyAccountLink();
		homepage.UserPressOnChangePasswordLink();
	    cp.UserCanChangePassword(pas, "123456789");
	    cp.Closex();
	    Thread.sleep(1000);
	    homepage.UserPressOnLogOutLink();
	}	
	
	@Test(priority = 3)
	public void UserCanLoginSuccessfuly(){
		loginpage=new UserLoginPage(driver);
		homepage.UserPressOnLoginLink();
		loginpage.UserCanLogin(mail, "1234567");
		
	}
        
	
	

}
