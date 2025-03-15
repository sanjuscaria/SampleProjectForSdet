package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class ExcelData {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sanju.scaria@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Kaiserpass@1234");
		
		driver.findElement(By.name("login")).click();
		
		
		SoftAssert softAssert = new SoftAssert();
		
		
	}
	
	@Test
	public void validateInput()
	{
		
	}
	
	@AfterTest
	public void tearDown()
	{
		
		
	}
	
	
	
	
	
	

}
