package OHRM_testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OHRMlibrary.login;
import Utils.Apputils;

public class admin_login_valid_inputs extends Apputils
{
	@Parameters({"uid","pwd"})
	@Test
	public void adminWithvalidData(String uid,String pwd)

	{
		login lp = new login();
		lp.adminLoginWithvalidinputs(uid,pwd);
		boolean res =lp.adminisDisplayedorNot();
		Assert.assertTrue(res);
		lp.loogOut();


	}
}
