package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageBase1 {
	
	//WebDriver driver;
	
	
	
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
		//PageFactory.initElements(driver,this);
	}

	@FindBy(name="q")
	WebElement searchField ;
	
	public void enterElementInSearchField()
	{
		searchField.sendKeys("cars");
	}
	

}
