package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC03_CreateLead extends OpentapsWrappers {

	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC02_CreateLead";
		testCaseName 	= "TC02 - CreateLead (POM)";
		testDescription = "Creating lead in Opentaps using POM framework";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String username,String password, String loginName,String compName, String fName, String lName) {
		
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedinUserName(loginName)
		.clickCrmSfa()
		.clickLead()
		.compName(compName)
		.fName(fName)
		.lName(lName)
		.submit();
		
		
	}
	
	
	
}
