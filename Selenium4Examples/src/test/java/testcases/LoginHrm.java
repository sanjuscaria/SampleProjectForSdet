package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageobjects.LoginPage;

public class LoginHrm {
	
	public WebDriver driver;
	
	@Test
	public void uploadFile() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadfile']"));
//		wait.until(ExpectedConditions.visibilityOf(chooseFile)).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		System.out.println("height : " +js.executeScript("return document.body.scrollHeight")); ;
		
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollBy(0,1266);");
		
		Thread.sleep(30);
		
		//driver.findElement(By.id("uploadfile")).sendKeys("C:\\temp\\sample.txt");
		//driver.quit();
		
	}
	
	
	
	@Test
	public void loginToHrmsite() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		Thread.sleep(5);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='top-links']/ul/li[2]/a/span[1]")));
//		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a/span[1]")).click();
//		Thread.sleep(2);
//		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[2]/a")).click();
		
		LoginPage loginPage = new LoginPage(driver);
		Thread.sleep(5);
		loginPage.clickMyAccounts();
		Thread.sleep(5);
		loginPage.clickLoginButton();
		
		driver.quit();
		
		
	}
	
	

}
