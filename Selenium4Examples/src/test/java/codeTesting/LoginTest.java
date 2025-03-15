package codeTesting;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class LoginTest extends Baseclass {
	

	@Test
	public void Login(ITestContext testContext)
	{

		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.myAccountClick();
		
		
		
		
		
		
	}
	
	

}
