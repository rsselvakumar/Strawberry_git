package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LeadPage extends OpentapsWrappers {

	public LeadPage() {

		if (!verifyTitle("Create Lead | opentaps CRM")) {
			Reporter.reportStep("This is NOT login page", "FAIL");
		}

	}

	public LeadPage compName(String compName) {
		enterById(prop.getProperty("CreateLead.CompanyName.Id"), compName);
		return this;
	}

	public LeadPage fName(String fName) {
		enterById(prop.getProperty("CreateLead.FirstName.Id"), fName);
		return this;
	}

	public LeadPage lName(String lName) {
		enterById(prop.getProperty("CreateLead.LastName.Id"), lName);
		return this;
	}

	public ViewLead submit() {
		clickByName(prop.getProperty("CreateLead.Submit.Name"));
		return new ViewLead();
	}

}
