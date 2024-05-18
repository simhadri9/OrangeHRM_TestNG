package OHRMlibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Userregistration extends Adminutils
{

	
	public boolean userres(String empname,String uname,String psw)
	{
		
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.name("btnAdd")).click();
		
		Select ulist = new Select(driver.findElement(By.id("systemUser_userType")));
		ulist.selectByVisibleText("ESS");
		
		driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys(empname);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(psw);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(psw);
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("searchBtn")).click();
		
		driver.findElement(By.id("resultTable"));
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		List<WebElement> cols = rows.get(1).findElements(By.tagName("tr"));
		if(cols.equals(uname))
		{
			return true;
		}else
		{
			return false;
		}
		
	}
}
