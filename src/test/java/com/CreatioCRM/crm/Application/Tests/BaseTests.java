package com.CreatioCRM.crm.Application.Tests;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.CreatioCRM.crm.Application.Steps.CookiesPageSteps;
import com.CreatioCRM.crm.Application.Steps.HomePageSteps;
import com.CreatioCRM.crm.Application.Steps.LoginPageSteps;
import com.CreatioCRM.crm.Application.Steps.SignUpPageSteps;
import com.CreatioCRM.crm.Framework.Base.BasePage;
import com.CreatioCRM.crm.Framework.Utilities.ExcelUtil;

public class BaseTests extends BasePage {

	public LoginPageSteps loginPage;
	public CookiesPageSteps cookiesPage;
	public HomePageSteps homePage;
	public SignUpPageSteps signUpPage;
	
	@BeforeMethod(dependsOnMethods = "setupBrowser")
	public void initializeAllPages() {
		WebDriver driver = new BasePage().getDriver(); //get driver after launching the browser window successfully
		loginPage = new LoginPageSteps(driver); // pass browser details to each class while locating elements
		cookiesPage = new CookiesPageSteps(driver);
		homePage = new HomePageSteps(driver);
		signUpPage = new SignUpPageSteps(driver);
	}
	
	@DataProvider(name="data")
	public String [][] testData(Method method){
		String [][] data = ExcelUtil.readData("TestData.xlsx", method.getName());
		return data;
	}
	
	
}
	