package codeTesting;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class XpathTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/");	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	driver.manage().window().maximize();
	
	//Thread.sleep(5000);
	
	Actions actions = new Actions(driver);
	
	
	WebElement computer = driver.findElement(By.xpath("//div[@class='header-menu']/child::ul/li[2]"));
	actions.moveToElement(computer).perform();
	
//	List<WebElement> lst = driver.findElements(By.xpath("//div[@class='item-box']/div/div[position()=2]/h2/a"));
//	
//	for(WebElement el : lst)
//	{
//		System.out.println(el.getText()); 
//	}
		
	Thread.sleep(3000);

	}

}
