package OHRMlibrary;

import org.openqa.selenium.By;

import Utils.Apputils;

public class login extends Apputils
{
	public void loginPage(String uname,String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	public void loogOut()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	public void adminLoginWithvalidinputs(String uname,String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	public boolean adminisDisplayedorNot()
	{
		driver.findElement(By.linkText("Admin")).isDisplayed();
		try 
		{
			driver.findElement(By.linkText("Admin"));
			return true;
			
		} catch (Exception e)
		{
			return false;
		}
	}
	public boolean errorMsgdisplayed()
	{
		
		String msg = driver.findElement(By.id("spanMessage")).getText();
		if(msg.toLowerCase().contains("invalid") || msg.toLowerCase().contains("empty"))
		{
			return true;
		}else
		{
			return false;
		}
	}

}
