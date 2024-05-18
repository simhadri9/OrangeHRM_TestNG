package OHRM_testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OHRMlibrary.Adminutils;
import OHRMlibrary.employee;

public class employee_registrationeTrst extends Adminutils
{

	@Parameters({"fname","lname"})
	@Test
	public void empcreation(String fname,String lname)
	{
		
		employee emp = new employee();
		boolean res = emp.employeeRegistration(fname,lname);
		Assert.assertFalse(res);
	}

}
