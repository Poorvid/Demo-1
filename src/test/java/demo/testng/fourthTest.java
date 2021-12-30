package demo.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fourthTest {
	
WebDriver driver;
	
	@BeforeTest
	public void start()
	{
		System.setProperty("webdriver.gecko.driver","lib/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void fourthclasstest()
	{
		driver.get("https://www.seleniumeasy.com/");
		driver.close();
	}
	

}
