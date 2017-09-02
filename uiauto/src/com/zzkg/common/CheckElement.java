package com.zzkg.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class CheckElement {
	public static boolean isExisting(AndroidDriver driver, String type, String pathExpression) {
		WebElement element = null;
		if (type == "id") {
			element = driver.findElementById(pathExpression);
		} else if (type == "xpath") {
			element = driver.findElementByXPath(pathExpression);
		}
		return element.isDisplayed();
	}
}
