package com.CreatioCRM.crm.Application.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.CreatioCRM.crm.Application.Elements.HomePageElements;

public class HomePageSteps extends HomePageElements {


	public HomePageSteps(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void verifyLoginIsSuccessful() {
		waitForElement(ApplicationHubHeader,10);
		log("pass","Application Login is Successful");
	}
	
	public void verifySignUpIsSuccessful() {
		waitForElement(UsersHeader,10);
		log("pass","Application Sign Up is Successful");
	}
public void verifyNewApplicationIsSuccessful() {
		waitForElement(NewApplicationHeader,10);
		log("pass","New Application Creation is Successful");
	}}

