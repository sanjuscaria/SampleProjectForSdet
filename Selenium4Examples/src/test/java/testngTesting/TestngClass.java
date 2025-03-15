package testngTesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;

public class TestngClass extends AnotationBase {
  @Test
  public void login() {
	  
	  System.out.println("from login-------------");
  }
  @Test
  public void averifyLogin() {
	  System.out.println("verify login -------------");
  }
  
  
}
