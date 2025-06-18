package com.CreatioCRM.crm.Framework.Listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.CreatioCRM.crm.Framework.Base.BasePage;
import com.CreatioCRM.crm.Framework.Reports.Reports;
import com.CreatioCRM.crm.Framework.Web.Commons.WebCommons;


public class TestListener extends Reports implements ITestListener {

	public void onTestStart(ITestResult result) {
		String testcaseName = result.getMethod().getMethodName();
		startReporting(testcaseName);
	}

	public void onTestSuccess(ITestResult result) {
		String testcaseName = result.getMethod().getMethodName();
		logger.pass("Test Execution is successful for "+testcaseName);
		stopReporting();
	}

	public void onTestFailure(ITestResult result) {
		String testcaseName = result.getMethod().getMethodName();		
		logger.fail("Test Execution is Failed for Test Case :"+testcaseName);
		logger.fail("Test Execution is Failed due to :"+result.getThrowable().getLocalizedMessage());
		try {
			logger.addScreenCaptureFromPath(WebCommons.windowScreenshot(new BasePage().getDriver(), testcaseName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		stopReporting();
	}

}
