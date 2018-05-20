package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import edit.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit a created Lead in Leaftap Application ";
		testNodes="EditLead";
		category="Sanity";
		authors="karthick Harish";
		browserName="chrome";
		dataSheetName="TC004_EditLead";

	}
	@Test(dataProvider="fetchData")
	public void EditLead(String UserName,String Password,String CompanyName,String FirstName,String LastName) {

		new LoginPage()
		.enterUserName(UserName)
		.enterPassword(Password)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickfindleads()
		.enterCompany(CompanyName)
		.clickLeadid()
		.clickEdit()
		.enterFirstName(FirstName)
		.enterLastName(LastName)
		.clickUpdateLead()
		.verifyLoggedName(FirstName);

	}
}

