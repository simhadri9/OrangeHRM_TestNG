package OHRMlibrary;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utils.Apputils;

public class Adminutils extends Apputils 
{

	String uid = "Admin";
	String pwd = "Qedge123!@#";
	login lp;
	
	@BeforeTest
	public void Adminlogin()
	{
		lp =new login();
		lp.loginPage(uid,pwd);
		
	}
	
	@AfterTest
	public void Adminlogout()
	{
		lp.loogOut();
	}
}
