package com.adidas.helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.adidas.constant.TeamWearConstant;
import com.adidas.element.pages.TeamwearElementsPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CommonHelper {
	
	private static AndroidDriver<AndroidElement> driver;
	private static WebDriverWait wait;
	
	public CommonHelper(AndroidDriver<AndroidElement> driver){
		CommonHelper.driver = driver;
		wait = new WebDriverWait(driver, TeamWearConstant.SLEEP);
	}
	
	public static void waitUntilVisibility(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void waitStaleness(By locator) {
		wait.until(ExpectedConditions.stalenessOf(driver.findElement(locator)));
	}
	
	public static void elementClick(By locator) {
		waitUntilVisibility(locator);
		driver.findElement(locator).click();
	}
	
	public static void sendkeys(By locator, String data) {
		driver.findElement(locator).sendKeys(data);
	}
	
	public static String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public static void scrollToElement(String scrollUntilVisibleText) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)."
				+ "instance(0)).scrollIntoView(new UiSelector().textContains(\"" + scrollUntilVisibleText + "\").instance(0))");
	}
	
	public static String getRating(String rating){
		return TeamwearElementsPage.rating.replaceAll("rating", rating);
	}
	
	public static void selectRating(String rating){		
		waitUntilVisibility(By.xpath(getRating(rating)));
		elementClick(By.xpath(getRating(rating)));
	}
	
	public static List<AndroidElement> getReviewList(){
		return driver.findElements(TeamwearElementsPage.XP_OF_REVIEWLIST);
	}
}