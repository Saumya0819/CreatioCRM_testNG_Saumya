package com.CreatioCRM.crm.Application.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.CreatioCRM.crm.Application.Elements.SignUpPageElements;

public class SignUpPageSteps extends SignUpPageElements{
	
	public SignUpPageSteps(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void verifySignUpPageIsLaunched() {
		waitForElement(signUpPageHeader, 30);
		log("pass","Application Signup page is launched successfully");
	}
	
	public void enterUserDetails(String email, String password) {
		enterText(businessEmailTxtb, uniqueId("hhmmss")+email);
		enterText(passwordTxtb, password);
		log("info","User details are entered successfully");
	}
	
	public void clickOnContinueButton() {
		click(continueBtn);
		log("info","Clicked on the Login Button");
	}
	
	public void enterCompanyDetails() {
		waitForElement(firstNameTxtb, 5);
		wait(3);
		enterText(firstNameTxtb, "Saumyaranjan");
		enterText(lastNameTxtb, "Hati");
		enterText(companyTxtb, "BharathTechAcademy");
		enterText(websiteTxtb, "www.BharathTechAcademy.com");
		enterText(countryTxtb, "India");
		waitForElement(countryOption,5);
		click(countryOption);
		wait(5);
		click(phoneTxtb);
		wait(5);
		enterInfo(phoneTxtb, "90"+uniqueId("ddMMhhmm"));
		log("info","Updated Company Details");
	}
	
	public void clickOnSignUpButton() {
		jsClick(SignUpBtn);
		log("info","Clicked on the SignUp Button");
	}
}