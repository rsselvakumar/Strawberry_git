package pages;

import wrappers.OpentapsWrappers;

public class LeadHome extends OpentapsWrappers {

	public LeadPage clickLead() {
		clickByLink(prop.getProperty("CreateLead.CreateButton.LinkText"));
		return new LeadPage();
	}
	
	//Contact creation start here
		public CreateContact clickContacts(){
			
			clickByLink(prop.getProperty("MyHome.Contacts.Link"));
			
			return new CreateContact();
		}

}
