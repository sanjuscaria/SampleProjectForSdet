package testcases;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class InterfaceTest  {



	@Test
	public void Login()
	{
		
		//WebElement e = driver.findElement(By.xpath("//body"));
		
	}

}

class BaseClass
{
	WebDriver driver;
	
	public BaseClass(WebDriver driver)
	{
		this.driver = new ChromeDriver();
	}
	
}