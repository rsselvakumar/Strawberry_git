package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewContact extends OpentapsWrappers {

	public ViewContact() {

		if (!verifyTitle("View Contact | opentaps CRM")) {
			Reporter.reportStep("This is NOT Home page", "FAIL");
		}

	}
	
	public ViewContact verifyContactFirstXPath(String fName){
		verifyTextContainsByXpath(prop.getProperty("ViewContact.FName.Xpath"), fName);
		return this;
	}
	public ViewContact verifyContactLastXPath(String lName){
		verifyTextContainsByXpath(prop.getProperty("ViewContact.LName.Xpath"), lName);
		return this;
	}
	
	// Edit contact
	public EditContact clickEdit(){
		
		clickByLink(prop.getProperty("ViewContact.Edit.Link"));
		
		return new EditContact();
	}
}