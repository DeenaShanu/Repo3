package demoPackage;

import org.testng.annotations.Test;

import utilities.ScreenShotUtility;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;



public class Base {
 
	public WebDriver driver;

	
  @BeforeMethod
  public void initializeBrowser() {
	  driver =  new ChromeDriver();
	  driver.get("https://groceryapp.uniqassosiates.com/admin/login");
	  driver.manage().window().maximize();
	 
  }

  @AfterMethod
  
  public void driverCloseAndQuit(ITestResult iTestResult) throws IOException {

	if (iTestResult.getStatus()==ITestResult.FAILURE) {

		ScreenShotUtility screenShot=new ScreenShotUtility();

		screenShot.getScreenshot(driver, iTestResult.getName());

	  }

		//driver.quit();

		

	}

}
