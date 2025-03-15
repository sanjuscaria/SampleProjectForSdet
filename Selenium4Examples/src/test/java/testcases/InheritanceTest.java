package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InheritanceTest extends BaseClass1 {
	
	//WebDriver driver;
	
	
	
	
	@Test
	public void search() throws InterruptedException
	{
		
		HomePage homePage = new HomePage(driver);
		homePage.enterElementInSearchField();
		
		//WebElement searchField =   driver.findElement(By.name("q"));
		//searchField.sendKeys("cars");
		Thread.sleep(3000);
		
		//myName = "";
		
//		WebElement btn = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
//		JavascriptExecutor js =  (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", btn);
//		
//		
//		Thread.sleep(3000);
//		String result = driver.findElement(By.xpath("//h3[@text='3563 Second Hand Cars in Bangalore']")).getText();
//		Assert.assertEquals(result, "3563 Second Hand Cars in Bangalore");
		
	}
	

}
