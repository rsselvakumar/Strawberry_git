package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC_CreateContact extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC_CreateContact";
		testCaseName 	= "Create Contact (POM)";
		testDescription = "Creating Contact in Opentaps using POM framework";
	}
	
	@Test(dataProvider="fetchData")
	public void createContact(String username,String password, String loginName, String fName, String lName) {
		
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedinUserName(loginName)
		.clickCrmSfa()
		.clickContacts()
		.clickCreateContact()
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickFindContact()
		.verifyContactFirstXPath(fName)
		.verifyContactLastXPath(lName);	
		
		
	}
	
	
	

}
