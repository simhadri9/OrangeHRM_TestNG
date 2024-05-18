package OHRMlibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class employee extends Adminutils
{
public boolean employeeRegistration(String fname,String lname)
	{
	
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys(fname);
	driver.findElement(By.id("lastName")).sendKeys(lname);
	String eid = driver.findElement(By.id("employeeId")).getAttribute("value");
	System.out.println(eid);
	driver.findElement(By.id("btnSave")).click();
	driver.findElement(By.linkText("Employee List")).click();
	driver.findElement(By.id("empsearch_id")).sendKeys(eid);
	driver.findElement(By.id("searchBtn")).click();
	
	driver.findElement(By.id("resultTable"));
	List<WebElement> rows = driver.findElements(By.tagName("tr"));
	WebElement cols = rows.get(1).findElement(By.tagName("td"));
	if(cols.getText().equals(eid))
	{
		return true;
	}else
	{
		return false;
	}
	
	
	}

}
