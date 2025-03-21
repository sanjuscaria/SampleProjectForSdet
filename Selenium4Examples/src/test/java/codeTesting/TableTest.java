package codeTesting;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TableTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[@id='content']/ul/li/a[contains(text(),'Sortable Data Tables')]")).click();
		
		WebElement tbl = driver.findElement(By.id("table1"));
		
	 	List<WebElement> rows = tbl.findElements(By.xpath(".//tbody/tr"));
	 	List<String> fnames = new ArrayList<>();
	 	System.out.println(rows.size());
	 	
	 	driver.findElement(By.xpath(""));
	 	for(int i = 0 ; i< rows.size(); i++)
	 	{
	 		//System.out.println(rows.get(i).findElement(By.xpath(".//td[1]")).getText());
	 		fnames.add(rows.get(i).findElement(By.xpath(".//td[1]")).getText()) ;	 		
	 	}
		
	 	
	 	
		
	Thread.sleep(20);	
	//driver.quit();
	}

}
