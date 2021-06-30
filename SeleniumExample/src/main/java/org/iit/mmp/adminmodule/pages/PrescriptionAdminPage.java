package org.iit.mmp.adminmodule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PrescriptionAdminPage {
	
	WebDriver driver;
	By  prescriptionButton = By.xpath("//input[@value='Add Precription']");
	By appointment=By.id("app_date");
	By prescriptionName = By.id("exampleInputcardnumber1");
	
	public PrescriptionAdminPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void addPrescription(String prescription,String dateOfAppointment)
	{
			driver.findElement(prescriptionButton).click();
			Select appt=new Select(driver.findElement(appointment));
			appt.selectByVisibleText(dateOfAppointment);
			
			driver.findElement(prescriptionName).sendKeys("");
			
	}
}


