package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase1 {
	
	WebDriver driver;

	public PageBase1(WebDriver driver) {
		super();
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	

}
