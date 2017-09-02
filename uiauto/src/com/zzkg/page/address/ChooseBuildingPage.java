package com.zzkg.page.address;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChooseBuildingPage {
	// �ֻ�����
	@FindBy(id = "com.geometry:id/tv_take_confirm")
	public WebElement confirm;

	public AndroidDriver driver;

	public ChooseBuildingPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}

	public void getBuilding(String building) {
		switch (building) {
		case "�Զ�������¥��C��(��ɾ)":
			break;
		case "�Զ�������¥��E��(��ɾ)":
			driver.swipe(505, 1610, 505, 1570, 500);
			break;
		case "�Զ�������¥��D��(��ɾ)":
			for (int i = 0; i < 2; i++) {
				driver.swipe(505, 1610, 505, 1570, 500);
			}
			break;
		}
		this.confirm.click();
	}

}
