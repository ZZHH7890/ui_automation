package com.zzkg.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	// 底部导航栏：我
	@FindBy(id = "com.geometry:id/account_tab")
	public WebElement meTab;

	// 底部导航栏：分类
	@FindBy(id = "com.geometry:id/dealer_tab")
	public WebElement classifyTab;

	// 底部导航栏：购物车
	@FindBy(id = "com.geometry:id/cart_tab")
	public WebElement cartTab;

	public AndroidDriver driver;

	public HomePage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}

	// 获取我页面
	public MePage getMePage() {
		this.meTab.click();
		return new MePage(driver);
	}

	// 获取购物车页面
	public CartPage getCartPage() {
		this.cartTab.click();
		return new CartPage(driver);
	}

	// 获取分类页面
	public ClassifyPage getClassifyPage() {
		this.classifyTab.click();
		return new ClassifyPage(driver);
	}
}
