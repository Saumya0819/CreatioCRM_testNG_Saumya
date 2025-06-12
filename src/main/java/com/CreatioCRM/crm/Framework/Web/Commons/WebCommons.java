package com.CreatioCRM.crm.Framework.Web.Commons;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CreatioCRM.crm.Framework.Base.BasePage;
import com.CreatioCRM.crm.Framework.Utilities.PropUtil;

public class WebCommons {
//1. This class will have all the common methods related to web operations
	public WebDriver driver = BasePage.getDriver();
	public Properties prop = PropUtil.readData("config.properties");
	
//2. Common method to Launch the Application
	public void launchApplication () {
		driver.get(prop.getProperty("APP_URL"));}
		
		
//3. Common method to scroll to the element
		public void scrollToElement(WebElement element) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", element);
	} 
//4. Common method to click on the Element
		public void clickElement(WebElement element) {
		scrollToElement(element);
		element.click();
	}
//5. Common method to click on the Hidden Element	
		public void clickHiddenElement(WebElement element) {
			scrollToElement(element);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		}
//6. Common method to double click on the Element 
		public void doubleClick(WebElement element) {
	        scrollToElement(element);
	        new Actions(driver).doubleClick(element).perform();
		}
//7. Common method to right click on the Element
		  public void rightClick(WebElement element) {
		        scrollToElement(element);
		        new Actions(driver).contextClick(element).perform();
		}	
//8.	Common method to enter text in the Element
		public void enterText(WebElement element, String text) {
			scrollToElement(element);
			element.clear();
			element.sendKeys(text);
		}
//9. Common method to enter text  into the Element	
		public void enterTextHidden(WebElement element, String text) {
			scrollToElement(element);
			Actions actions = new Actions(driver);
			actions.sendKeys(element,text).perform();
		}
//10. Common method to select the CheckBox
		public void selectCheckbox(WebElement checkbox, boolean status) {
	        scrollToElement(checkbox);
	        if (checkbox.isSelected() != status) {
	            checkbox.click();
			}}
//11. Common method to select the options from dropdown
       public void selectDropdownOption(WebElement dropdown, String option, String selectBy) {
	    scrollToElement(dropdown);
	    Select select = new Select(dropdown);
	            switch (selectBy.toLowerCase()) {
	                case "value":
	                    select.selectByValue(option);
	                    break;
	                case "visibletext":
	                    select.selectByVisibleText(option);
	                    break;
	                case "index":
	                    select.selectByIndex(Integer.parseInt(option));
	                    break;
	                default:
	                    throw new IllegalArgumentException("Invalid selection method: " + selectBy);                        
		}}
//12. Common method to wait using the java wait
       public void wait(int seconds) {
           try {
               Thread.sleep(seconds * 1000L);
           } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
           }}
//13.Common method to wait using implicit wait
        public void implicitWait(long seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
           }   
//14. Common method to wait using explicit wait for the element
        public void explicitWait(long seconds, WebElement element) {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
       wait.until(ExpectedConditions.visibilityOf(element));}

//15.  Common method to wait using explicit wait for the element
        public void waitForElement(By loactor, int seconds) {
    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
    		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(loactor, 0));}
        
//16. Common method to 
		public void waitForElementToBePresent(long seconds, By locator) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}        
//17. Common method to wait for the alert to be present
		public void waitForAlert(long seconds) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
			wait.until(ExpectedConditions.alertIsPresent());
		}
//Common method to Dismisses the alert if present.	
		  public void dismissAlert() {
		        Alert alert = driver.switchTo().alert();
		        alert.dismiss();}
//Sends input text to the alert prompt.
		  public void sendTextToAlert(String text) {
		        Alert alert = driver.switchTo().alert();
		        alert.sendKeys(text);}
		  

//18. Common method to upload the file using sendkeys
		public void uploadFile(WebElement element, String filePath) {
			scrollToElement(element);
			element.sendKeys(filePath);
		}
//19. Common method to take screenshot of entire Window
		 public static String windowScreenshot(WebDriver driver, String fileName) throws IOException {
		        String screenshotPath = System.getProperty("user.dir") + "\\Screenshots\\" + fileName + ".png";
		        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		        FileUtils.copyFile(screenshotFile, new File(screenshotPath));
		        return screenshotPath;
		}
//20. Common method to take screenshot of the specific element
		 public static String elementScreenshot(WebElement element, String fileName) throws IOException {
			String screenshotPath = System.getProperty("user.dir") + "\\Screenshots\\" + fileName + ".png";
			File screenshotFile = element.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File(screenshotPath));
			return screenshotPath;
		}
//21. Common method to switch to a frame by index
		public void switchToFrame(int index) {
			driver.switchTo().frame(index);
		}
//22. 	common method to switch to a frame by name or ID
		public void switchToFrame(String nameOrId) {
			driver.switchTo().frame(nameOrId);
		}
//23. 	common method to switch to a frame by WebElement
		public void switchToFrame(WebElement frameElement) {
			driver.switchTo().frame(frameElement);
		}
//24.	common method to switch back to the default content
		public void switchToDefaultContent() {
			driver.switchTo().defaultContent();
		}
		
//25. 	common method to switch to a new window
		public void switchToNewWindow() {
			String originalWindow = driver.getWindowHandle();
			for (String windowHandle : driver.getWindowHandles()) {
				if (!windowHandle.equals(originalWindow)) {
					driver.switchTo().window(windowHandle);
					break;
				}
			}
		}	
//26. 	common method for the date-time format to use (e.g., "yyyyMMddHHmmss")	
		public String uniqueId(String format) {
	        return new SimpleDateFormat(format).format(Calendar.getInstance().getTime());}
//27.	Common method for Returns the handle ID of the current browser window.
		 public String getCurrentWindowHandle() {
		        return driver.getWindowHandle();
		    }
		
//28. 	common to Switch the driver context to a new window
        public void switchToWindow(String windowHandle) {
			driver.switchTo().window(windowHandle);
		}
//29. 	Common method to Navigates the browser to the previous page.
        public void navigateBack() {
            driver.navigate().back();}

//30. 	Common method to Navigates the browser to the next page.
        public void navigateForward() {
			driver.navigate().forward();}
//31. 	Common method to Refreshes the current page.
        
		public void refreshPage() {
			driver.navigate().refresh();}   
		
		
}