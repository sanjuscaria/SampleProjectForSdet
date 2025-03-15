package testcases;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.manager.SeleniumManagerOutput.Result;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static void main(String[] args) throws InterruptedException {

		SoftAssert soft = new SoftAssert();
		
		FirefoxOptions options = new FirefoxOptions();
		//options.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		long start = System.currentTimeMillis();
		try {
		//driver.findElement(By.linkText("Broken Image")).click();
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Broken Image")));
		}catch(Exception ex)
		{
			System.out.println("Exception raised : "+ex.getMessage().toString());
		}
		long end = System.currentTimeMillis();
		
		long timeDiff = end - start;
		System.out.println("time taken : "+ timeDiff/1000);
		
		
		Thread.sleep(10);
		driver.quit();
		
		
		
		

		
		
		
		
				
		

	}

}
