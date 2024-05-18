package OHRM_testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OHRMlibrary.login;
import Utils.Apputils;

public class adminloginWith_invaliddata extends Apputils
{
	@Parameters({"uid","pwd"})
	@Test
	public void adminWithinvalidData(String uid,String pwd) 
	{
		login lp = new login();
		lp.loginPage(uid,pwd);
		boolean res = lp.errorMsgdisplayed();
		Assert.assertTrue(res);
		
	}
}
