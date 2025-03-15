package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	public WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	@FindBy(xpath="//*[@id='top-links']/ul/li[2]/a/span[1]")
	WebElement myAccouts;
	
	@FindBy(xpath="//*[@id='top-links']/ul/li[2]/ul/li[2]/a")
	WebElement loginButton;
	
	public void clickMyAccounts()
	{
		wait.until(ExpectedConditions.visibilityOf(myAccouts)).click();
		
		//myAccouts.click();
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}

}
