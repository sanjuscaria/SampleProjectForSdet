package testngTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookingSite {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void ahotelBooking()
	{		
		driver.findElement(By.xpath("//a[starts-with(text(),'Components')]")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Components')]/following-sibling::div/div/ul/li//a[contains(text(),'Mice and Trackballs (0)')]")).click();		
		String txt = driver.findElement(By.xpath("//h2[contains(text(),'Mice and Trackballs')]")).getText();
		Assert.assertEquals(txt, "Mice and Trackballs");		
		
	}
	
	@Test
	public void bhotelBooking()
	{		
		driver.findElement(By.xpath("//a[starts-with(text(),'Components')]")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Components')]/following-sibling::div/div/ul/li//a[contains(text(),'Mice and Trackballs (0)')]")).click();		
		String txt = driver.findElement(By.xpath("//h2[contains(text(),'Mice and Trackballs')]")).getText();
		Assert.assertEquals(txt, "Mice and Trackballs");		
		
	}
	
	@Test
	public void chotelBooking()
	{		
		driver.findElement(By.xpath("//a[starts-with(text(),'Components')]")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Components')]/following-sibling::div/div/ul/li//a[contains(text(),'Mice and Trackballs (0)')]")).click();		
		String txt = driver.findElement(By.xpath("//h2[contains(text(),'Mice and Trackballs')]")).getText();
		Assert.assertEquals(txt, "Mice and Trackballs");		
		
	}
	
	@Test
	public void dhotelBooking()
	{		
		driver.findElement(By.xpath("//a[starts-with(text(),'Components')]")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Components')]/following-sibling::div/div/ul/li//a[contains(text(),'Mice and Trackballs (0)')]")).click();		
		String txt = driver.findElement(By.xpath("//h2[contains(text(),'Mice and Trackballs')]")).getText();
		Assert.assertEquals(txt, "Mice and Trackballs");		
		
	}
	
	@Test
	public void ehotelBooking()
	{		
		driver.findElement(By.xpath("//a[starts-with(text(),'Components')]")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Components')]/following-sibling::div/div/ul/li//a[contains(text(),'Mice and Trackballs (0)')]")).click();		
		String txt = driver.findElement(By.xpath("//h2[contains(text(),'Mice and Trackballs')]")).getText();
		Assert.assertEquals(txt, "Mice and Trackballs");		
		
	}
	
	@Test
	public void fhotelBooking()
	{		
		driver.findElement(By.xpath("//a[starts-with(text(),'Components')]")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Components')]/following-sibling::div/div/ul/li//a[contains(text(),'Mice and Trackballs (0)')]")).click();		
		String txt = driver.findElement(By.xpath("//h2[contains(text(),'Mice and Trackballs')]")).getText();
		Assert.assertEquals(txt, "Mice and Trackballs");		
		
	}

}
