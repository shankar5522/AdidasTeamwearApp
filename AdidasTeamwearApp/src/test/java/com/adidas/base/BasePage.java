package com.adidas.base;

import java.net.URL;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.adidas.constant.TeamWearConstant;
import com.adidas.exception.AdidasTeamwearException;
import com.adidas.helper.CommonHelper;
import com.adidas.utils.TestExecutionProp;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasePage {

	protected AndroidDriver<AndroidElement> driver;
	protected DesiredCapabilities desiredCapabilities;
	protected URL url;
	private final Logger APP_LOGS = TestExecutionProp.getTestExecutionLogsProperties();

	@BeforeTest
	public void setup(){
		try {
			APP_LOGS.info("Inside Before Test - Setup");
			desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability(TeamWearConstant.APP_ACTIVITY, TeamWearConstant.MAIN_ACTIVITY);
			desiredCapabilities.setCapability(TeamWearConstant.APP_PACKAGE, TeamWearConstant.APP_CHALLENGE);
			url =new URL(TeamWearConstant.TEAMWEAR_APP_URL);
			driver =new AndroidDriver<>(url, desiredCapabilities);
			new CommonHelper(driver);
		}catch(Exception e){
			throw new AdidasTeamwearException(e.getMessage());
		}
	}

	@AfterTest
	public void tearDown(){
		APP_LOGS.info("Inside After Test - TearDown");
		driver.quit();
	}
}
