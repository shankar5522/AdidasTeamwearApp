package com.adidas.helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.adidas.constant.TeamWearConstant;
import com.adidas.elements.TeamwearElements;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CommonHelper {
	
	private static AndroidDriver<AndroidElement> androidDriver;
	private static WebDriverWait wait;
	
	public CommonHelper(AndroidDriver androidDriver){
		System.out.println("Helper Constructore 	: ");
		this.androidDriver = androidDriver;
		wait = new WebDriverWait(androidDriver, TeamWearConstant.SLEEP);
	}
}
