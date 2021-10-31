package com.adidas.element.pages;

import org.openqa.selenium.By;

public class TeamwearElementsPage {

	//Product Elements
	public static final By ID_OF_PRODUCTIMAGE = By.id("com.example.challenge:id/productImage");
	public static final By ID_OF_PRODUCTNAME = By.id("com.example.challenge:id/productName");
	public static final By ID_OF_PRODUCTPRICE = By.id("com.example.challenge:id/productPrice");
	
	//Review Elements
	public static final By ID_OF_ADDREVIEW = By.id("com.example.challenge:id/addReview");
	public static final By ID_OF_SAVEREVIEW = By.id("com.example.challenge:id/saveReview");
	public static final By ID_OF_REVIEWDETAILS = By.id("com.example.challenge:id/reviewDetails");
	
	//Rating Element
	public static final By ID_OF_RATINGDROPDOWN = By.id("com.example.challenge:id/reviewNumber");
	public static String rating = "//*[@resource-id='android:id/text1' and @index='\" + rating + \"']";
	public static final By XP_OF_REVIEWLIST = By.xpath("//*[@resource-id='com.example.challenge:id/reviewsRecycler']//android.widget.TextView");
}