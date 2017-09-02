package com.zzkg.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zzkg.page.address.AddressListPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MePage {

	// δ��¼ʱ�ҵ�ҳ���¼��ť
	@FindBy(id = "com.geometry:id/tv_login")
	public WebElement loginBut;

	// �ҵ�ҳ���ҵĵ�ַ��ť
	@FindBy(id = "com.geometry:id/textView4")
	public WebElement addressBut;

	public AndroidDriver driver;

	public MePage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}

	// ��ȡ��¼ҳ��
	public LoginPage getLoginPage() {
		this.loginBut.click();
		return new LoginPage(driver);
	}

	// ��ȡ��ַ�б�ҳ��
	public AddressListPage getAddressListPage() {
		this.addressBut.click();
		return new AddressListPage(driver);
	}

}
