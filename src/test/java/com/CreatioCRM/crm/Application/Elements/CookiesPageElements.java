package com.CreatioCRM.crm.Application.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.CreatioCRM.crm.Framework.Web.Commons.WebCommons;


public class CookiesPageElements extends WebCommons{
	
	@FindBy(xpath="//h2[@id='CybotCookiebotDialogBodyContentTitle']")
	public WebElement cookiesHeader;
	@FindBy(xpath="//div[@id='CybotCookiebotDialogBodyContentText']")
	public WebElement cookiesContent;
	
	@FindBy(xpath="//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
	public WebElement allowAllBtn;

	@FindBy(xpath="//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowallSelection']")
	public WebElement allowSelectionBtn;
	@FindBy(xpath="//button[@id='CybotCookiebotDialogBodyButtonDecline']")
	public WebElement denyBtn;
	@FindBy(xpath="//span[@class='css-1gstez2']")
	public WebElement Feedback;
	
	@FindBy(xpath="//div[@class='CybotCookiebotDialogBodyLevelButtonSliderWrapper CybotCookiebotDialogBodyLevelButtonSliderWrapperDisabled']")
	public WebElement NecessaryCookiesbtn;
	@FindBy(xpath="//input[@id='CybotCookiebotDialogBodyLevelButtonPreferences']")
	public WebElement PreferencesCookiesbtn;
	@FindBy(xpath="//input[@id='CybotCookiebotDialogBodyLevelButtonStatistics']")
	public WebElement StatisticsCookiesbtn;
	@FindBy(xpath="//input[@id='CybotCookiebotDialogBodyLevelButtonMarketing']")
	public WebElement MarketingCookiesbtn;
	@FindBy(xpath="//a[@id='CybotCookiebotDialogBodyEdgeMoreDetailsLink']")
	public WebElement showDetailsLink;
	@FindBy(xpath="//img[@id='CybotCookiebotDialogPoweredbyImage']")
	public WebElement creatioLogo;
	@FindBy(xpath="//a[@id='CybotCookiebotDialogPoweredbyCybot']")
	public WebElement cookiebotLogo;
	@FindBy(xpath="//button[@id='CybotCookiebotDialogBodyButtonDecline']")
	public WebElement declineBtn;
	@FindBy(xpath="//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowallSelection']")
	public WebElement allowSelectionBtn2;
	@FindBy(xpath="//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
	public WebElement allowAllBtn2;
	@FindBy(xpath="//button[@id='CybotCookiebotDialogBodyButtonClose']")
	public WebElement closeBtn;
		
}