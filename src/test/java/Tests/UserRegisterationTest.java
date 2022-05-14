package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Pages.HomePage;
import Pages.UserLoginPage;
import Pages.UserRegisterationPage;

public class UserRegisterationTest extends TestBase{
	
	
	HomePage homepage;
	UserRegisterationPage registerpage;
	UserLoginPage loginpage;
	Faker fak=new Faker();
	String fname=fak.name().firstName();
	String lname=fak.name().lastName();
	String mail=fak.internet().emailAddress();
	String pas=fak.number().digits(6).toString();
	
	
	@Test(priority = 1)
	public void UserRegiserSuccessfully() {
		homepage=new HomePage(driver);
		registerpage=new UserRegisterationPage(driver);
		
		homepage.UserPressOnRegisterLink();
		registerpage.UserCanRegister(fname, lname, mail, pas);
		assertEquals(registerpage.mes.getText(), "Your registration completed");
		
	}
	
	@Test(priority = 2)
	public void UserCanLogOutSuccessfuly() {
		
		homepage=new HomePage(driver);
		homepage.UserPressOnLogOutLink();
		
	}
	
	@Test(priority = 3)
	public void UserCanLoginSuccessfuly(){
		loginpage=new UserLoginPage(driver);
		homepage.UserPressOnLoginLink();
		loginpage.UserCanLogin(mail, pas);
		
	}
	
	@Test(priority = 4)
	public void UserCanLogOutSuccessfulyAgain() {
		
		homepage=new HomePage(driver);
		homepage.UserPressOnLogOutLink();
		
	}

}
