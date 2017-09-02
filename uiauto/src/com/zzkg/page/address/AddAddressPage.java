package com.zzkg.page.address;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddAddressPage {
	// 收货人姓名
	@FindBy(id = "com.geometry:id/et_user_name")
	public WebElement contactInputBox;

	// 性别男
	@FindBy(id = "com.geometry:id/rb_man")
	public WebElement man;

	// 性别女
	@FindBy(id = "com.geometry:id/rb_woman")
	public WebElement woman;

	// 收货人联系电话
	@FindBy(id = "com.geometry:id/et_phone")
	public WebElement phoneInputBox;

	// 楼栋信息
	@FindBy(id = "com.geometry:id/tv_build")
	public WebElement building;

	// 门牌号
	@FindBy(id = "com.geometry:id/et_house_number")
	public WebElement roomInputBox;

	// 保存按钮
	@FindBy(id = "com.geometry:id/menu_save")
	public WebElement save;

	public AndroidDriver driver;

	public AddAddressPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}

	// 获取选中楼栋信息页面
	public ChooseBuildingPage getChooseBuildingPage() {
		this.building.click();
		return new ChooseBuildingPage(driver);
	}

	// 增加地址
	public void addAddress(String contact, String gender, String phone, String room) {
		this.contactInputBox.sendKeys(contact);
		switch (gender) {
		case "man":
			this.man.click();
			break;
		case "woman":
			this.woman.click();
			break;
		}
		this.phoneInputBox.sendKeys(phone);
		this.roomInputBox.sendKeys(room);
		this.save.click();
	}

	// 获取页面源码
	public String getAddAddressPageSource() {
		return this.driver.getPageSource();
	}
}
