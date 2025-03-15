package codeTesting;

import org.openqa.selenium.WebDriver;

public class AppTest {

	private WebDriver driver;
	
	public void setUp(String browser) {
		driver = WebDriverManager.getInstance(browser).getDriver();
				
	}
	
	public void testGoogle() {
		driver.get("");
		System.out.println(Thread.currentThread().getName()+": "+ driver.getTitle());
	}
	
	public void teatDown()
	{
		driver.quit();
	}
	
	
}
