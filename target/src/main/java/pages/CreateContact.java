package pages;

import wrappers.OpentapsWrappers;

public class CreateContact extends OpentapsWrappers {

	public EnterContact clickCreateContact() {
		clickByLink(prop.getProperty("Contacts.CreateContact.Link"));
		return new EnterContact();
	}
	//Clicking Find Contact link from contact page
		public FindContact clickFindContact(){
			clickByLink(prop.getProperty("Contacts.FindContact.Link"));
			return new FindContact();
		}
		
	}
	

