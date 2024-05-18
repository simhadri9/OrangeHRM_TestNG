
package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

public class Apputils {
	public static WebDriver driver;
	public static String url = "http://orangehrm.qedgetech.com";
	@BeforeSuite
	public static void lunchApp()
	
	{
		System.setProperty("webdriver.edge.driver","msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		
	}
	@AfterSuite
	public static void closeApp()
	{
		driver.close();
	}
	

}
