package com.adidas.base;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.adidas.constant.TeamWearConstant;
import com.adidas.exception.AdidasTeamwearException;
import com.adidas.helper.CommonHelper;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasePage {

	private AndroidDriver<AndroidElement> androidDriver;
	private DesiredCapabilities desiredCapabilities;
	
	private URL url;
	
	@BeforeTest
	public void setup(){
		try {
		desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(TeamWearConstant.APP_ACTIVITY, TeamWearConstant.MAIN_ACTIVITY);
		desiredCapabilities.setCapability(TeamWearConstant.APP_PACKAGE, TeamWearConstant.APP_CHALLENGE);
		
		url =new URL(TeamWearConstant.TEAMWEAR_APP_URL);
		androidDriver =new AndroidDriver<>(url, desiredCapabilities);
		new CommonHelper(androidDriver);
		
		}catch(Exception exception){
			throw new AdidasTeamwearException(exception.getMessage());
		}
	}
	
	@AfterTest
	public void teardown(){
		androidDriver.quit();
	}
}
