package com.CreatioCRM.crm.Application.Tests;

import org.testng.annotations.Test;

public class ApplicationTests extends BaseTests {

	@Test(priority = 1)
	public void verifyCookiesPopUpIsDisplayed() {
		loginPage.launchApplication();
		cookiesPage.verifyWhetherCookiesPopUpIsDisplayed();
	}
	@Test(priority = 2, dataProvider = "data")
	public void verifyCookiesPopupContent(String content) {
		loginPage.launchApplication();
		cookiesPage.verifyWhetherCookiesPopUpIsDisplayed();
		cookiesPage.verifyCookiesPopUpContent(content);
	}

	@Test(priority = 3)
	public void verifyCookiesPopupLogosAndButtons() {
		loginPage.launchApplication();
		cookiesPage.verifyWhetherCookiesPopUpIsDisplayed();
		cookiesPage.verifyCookiesPopUpLogos();
		cookiesPage.verifyCookiesPopUpSwitchButtons();
		cookiesPage.verifyCookiesSelectionButtons();
	}

	
}