package demoPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;


public class LoginPageTest extends Base {
	
	
	
  @Test(description="Verify whether user is able to login with valid credentials")
  public void verifyLoginWithValidCredentials() throws IOException {
	 String username = ExcelUtility.getStringData(0, 0, "LoginPage"); 
	 String password = ExcelUtility.getStringData(0, 1, "LoginPage");
	 
	 LoginPage login = new LoginPage(driver);
	 login.enterUsernameOnUsernameField(username);
	 login.enterPasswdOnPswdField(password);
	 login.clickOnLoginButton();
	 
	  
  }
  @Test
  public void verifyLoginWithInvalidUsernameAndPswd () throws IOException {
	  
	  
	  String username = ExcelUtility.getStringData(1, 0, "LoginPage"); 
	  String password = ExcelUtility.getStringData(1, 1, "LoginPage");
	 
	  LoginPage login = new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterPasswdOnPswdField(password);
	  login.clickOnLoginButton();
  }
  @Test
  public void verifyLoginWithValidUsernameAndInvalidPswd () throws IOException {
	  String username = ExcelUtility.getStringData(2, 0, "LoginPage"); 
	  String password = ExcelUtility.getStringData(2, 1, "LoginPage");
	  LoginPage login = new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterPasswdOnPswdField(password);
	  login.clickOnLoginButton();	  
  }
  @Test
  public void verifyLoginWithInvalidCredentials () throws IOException {
	  
	  String username = ExcelUtility.getStringData(3, 0, "LoginPage"); 
	  String password = ExcelUtility.getStringData(3, 1, "LoginPage");
	  LoginPage login = new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterPasswdOnPswdField(password);
	  login.clickOnLoginButton();	  	 
  }
}
