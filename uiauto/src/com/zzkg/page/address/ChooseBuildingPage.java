package com.zzkg.page.address;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChooseBuildingPage {
	// 手机号码
	@FindBy(id = "com.geometry:id/tv_take_confirm")
	public WebElement confirm;

	public AndroidDriver driver;

	public ChooseBuildingPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}

	public void getBuilding(String building) {
		switch (building) {
		case "自动化测试楼栋C栋(勿删)":
			break;
		case "自动化测试楼栋E栋(勿删)":
			driver.swipe(505, 1610, 505, 1570, 500);
			break;
		case "自动化测试楼栋D栋(勿删)":
			for (int i = 0; i < 2; i++) {
				driver.swipe(505, 1610, 505, 1570, 500);
			}
			break;
		}
		this.confirm.click();
	}

}
