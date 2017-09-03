package com.zzkg.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	// �ֻ�����
	@FindBy(id = "com.geometry:id/phoneEdit")
	public WebElement phone;
	// ��֤��
	@FindBy(id = "com.geometry:id/verifyCodeEdit")
	public WebElement code;
	// �Ƽ���
	@FindBy(id = "com.geometry:id/recommand")
	public WebElement introducerCode;
	// ��¼��ť
	@FindBy(id = "com.geometry:id/loginBtn")
	public WebElement loginBut;

	public AndroidDriver driver;

	public LoginPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}

	public void login(String phone, String code, String introducerCode) {
		this.phone.sendKeys(phone);
		this.code.sendKeys(code);
		this.introducerCode.sendKeys(introducerCode);
		this.loginBut.click();
	}

}
