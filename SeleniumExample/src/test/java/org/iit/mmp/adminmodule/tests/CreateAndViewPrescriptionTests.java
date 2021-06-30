package org.iit.mmp.adminmodule.tests;

import org.iit.mmp.adminmodule.pages.CreateReportAdminPage;
import org.iit.mmp.adminmodule.pages.PrescriptionAdminPage;
import org.iit.mmp.base.TestBase;
import org.iit.mmp.helper.HelperClass;
import org.testng.annotations.Test;

public class CreateAndViewPrescriptionTests extends TestBase {

	String adminUser;
	String adminPassword;
	String urlAdmin;
	String searchPatient;
	String searchPatientSSN;
	@Test(description="US_005 Create and View the Prescription",groups={"US_005","regression","sanity","adminmodule"})
	public void validatePrescription() throws Exception   {
		
		instantiateDriver();
		adminUser = pro.getProperty("adminUser");
		adminPassword = pro.getProperty("adminPassword");
		urlAdmin = pro.getProperty("urlAdmin");
		searchPatient = pro.getProperty("searchPatient");
		searchPatientSSN = pro.getProperty("searchPatientSSN");
		HelperClass helperObj = new HelperClass(driver);
		helperObj.adminLogin(adminUser, adminPassword);
		helperObj.moduleNavigation("Patients");
		CreateReportAdminPage createReportObj = new CreateReportAdminPage(driver);
		createReportObj.patientSearchBySSN(searchPatientSSN);
		PrescriptionAdminPage prescriptionPage  =new PrescriptionAdminPage(driver);
		prescriptionPage.addPrescription();
		
	 
		
		
		
		
		
		
		
		
		
		
		
		 
	}
}
