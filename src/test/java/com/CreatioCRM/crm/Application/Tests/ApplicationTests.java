package com.CreatioCRM.crm.Application.Tests;

import org.testng.annotations.Test;

public class ApplicationTests extends BaseTests {

	@Test(priority = 1)
	public void verifyCookiesPopUpIsDisplayed() {
		loginPage.launchApplication();
		cookiesPage.verifyWhetherCookiesPopUpIsDisplayed();
	}

	
}