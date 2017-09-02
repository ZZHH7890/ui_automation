package com.zzkg.page.address;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddressListPage {
	// 新增收货地址按钮
	@FindBy(id = "com.geometry:id/title")
	public WebElement addAddressBut;

	public AndroidDriver driver;

	public AddressListPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}

	// 获取新增地址页面
	public AddAddressPage getAddAddressPage() {
		this.addAddressBut.click();
		return new AddAddressPage(driver);
	}

	// 获取页面源码
	public String getAddressListPageSource() {
		return this.driver.getPageSource();
	}

}
