package codeTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IResultMap;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass implements ITestListener {

	public static WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown(ITestContext testContext)
	{
		System.out.println("sanju "+testContext.getPassedTests().toString());
		
		IResultMap result = testContext.getPassedTests();
		
		for(ITestResult res : result.getAllResults()) {
			System.out.println("passed tests : "+ res.getName());
		}
		
		
		//driver.close();
	}
	
	

}
