package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditContact extends OpentapsWrappers {
	public EditContact() {

		if (!verifyTitle("opentaps CRM")) {
			Reporter.reportStep("This is NOT Edit page", "FAIL");
		}
	}

	public EditContact editFname(String editedFname) {

		enterById(prop.getProperty("EditContact.FirstName.id"), editedFname);

		return this;
	}

	public EditContact editLname(String editedLname) {

		enterById(prop.getProperty("EditContact.LastName.id"), editedLname);

		return this;
	}
	
	public ViewContact updateButton() {

		clickByName(prop.getProperty("EditContact.Submit.Name"));

		return new ViewContact();
	}
	
	
	
	

}
