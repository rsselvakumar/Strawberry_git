package pages;

import wrappers.OpentapsWrappers;

public class EnterContact extends OpentapsWrappers {

	public EnterContact enterFirstName(String firstName) {
		enterById(prop.getProperty("CreateContact.FirstName.Id"), firstName);
		return this;
	}

	public EnterContact enterLastName(String lastName) {
		enterById(prop.getProperty("CreateContact.LastName.Id"), lastName);
		return this;
	}

	public ViewContact clickFindContact() {
		clickByName(prop.getProperty("CreateContact.Submit.Name"));
		return new ViewContact();
	}

	
}
