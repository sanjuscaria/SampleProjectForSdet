package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExec {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		WebElement searchBox = driver.findElement(By.cssSelector("input[type='search']"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(10);
		
		try {
			js.executeScript("window.scrollBy(0,2000)");
		} catch (Exception e) {
			System.out.println("Exception raised : "+e.getMessage().toLowerCase());
		}
		
		System.out.println("done");
		driver.quit();
		
		
		
		

	}

}
