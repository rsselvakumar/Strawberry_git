package pages;

import wrappers.OpentapsWrappers;

public class FindContact extends OpentapsWrappers{
	
	public FindContact enterFirstName(String firstName) {
		enterByXath(prop.getProperty("FindContact.FirstName.XPath"), firstName);
		return this;
	}

	public FindContact enterLastName(String lastName) {
		enterByXath(prop.getProperty("FindContact.LastName.XPath"), lastName);
		return this;
	}

	public FindContact clickFindContact() {
		clickByXpath(prop.getProperty("FindContact.Button.XPath"));
		return this;
	}
	public ViewContact clickResult(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByLink(prop.getProperty("FindContact.Result.Link"));
		
		return new ViewContact();
	}
}
