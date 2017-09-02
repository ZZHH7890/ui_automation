package com.zzkg.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	// 手机号码
	@FindBy(id = "com.geometry:id/phoneEdit")
	public WebElement phone;
	// 验证码
	@FindBy(id = "com.geometry:id/verifyCodeEdit")
	public WebElement code;
	// 登录按钮
	@FindBy(id = "com.geometry:id/loginBtn")
	public WebElement loginBut;

	public AndroidDriver driver;

	public LoginPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}
	
	public void login() {
		this.phone.sendKeys("13714672776");
		this.code.sendKeys("1234");
		this.loginBut.click();
	}

}
