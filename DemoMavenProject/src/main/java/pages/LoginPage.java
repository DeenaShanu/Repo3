package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	

	public WebDriver driver;
	
	//Constructor
	public LoginPage(WebDriver driver) { 
		this.driver = driver;	
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(xpath="//input[@id='loginform-username']")private WebElement usernameLoc;
	@FindBy(xpath="//input[@id='loginform-password']")private WebElement paswdLoc;
	@FindBy(xpath="//button[text()='Login']")private WebElement loginBtnLoc;
	

	
	public void enterUsernameOnUsernameField(String username) {
		usernameLoc.sendKeys(username);
	}
	public void enterPasswdOnPswdField(String password) {
		paswdLoc.sendKeys(password);
	}
	public void clickOnLoginButton() {
		loginBtnLoc.click();
	}
}
