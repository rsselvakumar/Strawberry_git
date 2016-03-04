package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC_SearchContact extends OpentapsWrappers {
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC_SearchContact";
		testCaseName 	= "Create Contact (POM)";
		testDescription = "Creating Contact in Opentaps using POM framework";
	}
	
	@Test(dataProvider="fetchData")
	public void searchContact(String username,String password, String loginName, String fName, String lName) {
		
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedinUserName(loginName)
		.clickCrmSfa()
		.clickContacts()
		.clickFindContact()
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickFindContact()
		.clickResult()
		.verifyContactFirstXPath(fName)
		.verifyContactLastXPath(lName);			
	}
}


