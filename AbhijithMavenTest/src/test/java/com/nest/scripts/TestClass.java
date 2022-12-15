package com.nest.scripts;

import org.apache.poi.ss.util.NumberToTextConverter;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nest.base.Base;
import com.nest.constants.AutomationConstants;
import com.nest.pages.AddEmployee;
import com.nest.pages.HomePage;
import com.nest.pages.LoginPage;
import com.nest.utilities.ExcelUtility1;
import com.nest.utilities.ExcelUtility2;

public class TestClass extends Base {
	 LoginPage objLogin;
	    HomePage objHome;
	    AddEmployee objAdd;


	    @Test(priority=0)
	    public void ValidLoginVerification() throws Exception 
	    {

	          objLogin=new LoginPage(getDriver());

	          String actualusername=ExcelUtility1.getCellData(0, 11).getStringCellValue();
	          objLogin.setUserName(actualusername);
	          Assert.assertEquals(AutomationConstants.expusername, actualusername);


	          String actualpassword=NumberToTextConverter.toText(ExcelUtility1.getCellData(0, 12).getNumericCellValue());
	          objLogin.setPassword(actualpassword);
	          Assert.assertEquals(AutomationConstants.expPassword, actualpassword);

	          objLogin.clickLogin();

	          String actualvalue=getDriver().getTitle();
	          Assert.assertEquals(AutomationConstants.ExpectedValue,actualvalue);
	          System.out.println(actualvalue);

	 

	      }

	    @Test(priority=1)
	      public void ValidHomeVerification() throws Exception
	    {
	        objHome=new HomePage(getDriver());
	        objHome.addEmployee();
	    }


	      @Test(priority=2)
	      public void ValidAddEmpVerification() throws Exception {

	          objAdd=new AddEmployee(getDriver());

	          String actualname=ExcelUtility2.getCellData(0, 0);
	          objAdd.setName(actualname);
	          Assert.assertEquals(AutomationConstants.expname, actualname);

	          String actualpassword=ExcelUtility2.getCellData(0, 1);
	          objAdd.setPassword(actualpassword);
	          Assert.assertEquals(AutomationConstants.exppassword, actualpassword);

	          String actualemail=ExcelUtility2.getCellData(0, 2);
	          objAdd.setMail(actualemail);
	          Assert.assertEquals(AutomationConstants.expemail, actualemail);

	          String actualdesignation=ExcelUtility2.getCellData(0, 3);
	          objAdd.setDesignation(actualdesignation);
	          Assert.assertEquals(AutomationConstants.expdesignation, actualdesignation);

	          String actualreportingTo=ExcelUtility2.getCellData(0, 4);
	          objAdd.setreportingTo(actualreportingTo);
	          Assert.assertEquals(AutomationConstants.expreportingto, actualreportingTo);

	          String actualmemberOf=ExcelUtility2.getCellData(0, 5);
	          objAdd.setmemberOf(actualmemberOf);
	          Assert.assertEquals(AutomationConstants.expmemberof, actualmemberOf);

	          String actualempId=NumberToTextConverter.toText(ExcelUtility1.getCellData(0, 6).getNumericCellValue());
	          objAdd.setempId(actualempId);
	          Assert.assertEquals(AutomationConstants.expempid, actualempId);

	          String actualpassword2=ExcelUtility2.getCellData(0, 7);
	          objAdd.setPassword2(actualpassword2);
	          Assert.assertEquals(AutomationConstants.exppassword2, actualpassword2);

	          String actualnumber=NumberToTextConverter.toText(ExcelUtility1.getCellData(0, 8).getNumericCellValue());
	          objAdd.setNumber(actualnumber);
	          Assert.assertEquals(AutomationConstants.expnumber, actualnumber);
	          
	          objAdd.clickreportingStaff();
	          
	          String actualtype=ExcelUtility2.getCellData(0, 9);
	          objAdd.setempType(actualtype);
	          Assert.assertEquals(AutomationConstants.exptype, actualtype);

	          //objAdd.clickreportingStaff();

	          String actualaddress=ExcelUtility2.getCellData(0, 10);
	          objAdd.setAddress(actualaddress);
	          Assert.assertEquals(AutomationConstants.expaddress, actualaddress);


	          objAdd.clickLogin();

	      }

 
}
