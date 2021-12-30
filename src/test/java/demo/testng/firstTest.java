package demo.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstTest {
	
WebDriver driver;
	
	//@BeforeTest
	//public void start()
	//{
		//System.setProperty("webdriver.gecko.driver","lib/geckodriver.exe");
	//	driver = new FirefoxDriver();
	//}
	
	@Test
	public void firstclasstest()
	{
		System.setProperty("webdriver.gecko.driver","lib/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.close();
		
	}
	
	@Test
	public void firstclasstesttwo()
	{
		
	}
	

}
