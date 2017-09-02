package com.zzkg.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zzkg.page.address.AddressListPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MePage {

	// 未登录时我的页面登录按钮
	@FindBy(id = "com.geometry:id/tv_login")
	public WebElement loginBut;

	// 我的页面我的地址按钮
	@FindBy(id = "com.geometry:id/textView4")
	public WebElement addressBut;

	public AndroidDriver driver;

	public MePage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}

	// 获取登录页面
	public LoginPage getLoginPage() {
		this.loginBut.click();
		return new LoginPage(driver);
	}

	// 获取地址列表页面
	public AddressListPage getAddressListPage() {
		this.addressBut.click();
		return new AddressListPage(driver);
	}

}
