package com.zzkg.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	// �ײ�����������
	@FindBy(id = "com.geometry:id/account_tab")
	public WebElement meTab;

	public AndroidDriver driver;

	public HomePage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}
	//��ȡ��ҳ��
	public MePage getMePage() {
		this.meTab.click();
		return new MePage(driver);
	}

}
