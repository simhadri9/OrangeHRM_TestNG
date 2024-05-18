package OHRM_testcases;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OHRMlibrary.Adminutils;
import OHRMlibrary.Userregistration;

public class usercreate_test extends Adminutils
{

	@Parameters({"empname","uname","psw"})
	@Test
	public void createUser(String empname,String uname,String psw)
	{
		Userregistration ur = new Userregistration();
		ur.userres(empname,uname,psw);
		Assert.assertTrue(true);
	}
	
}
