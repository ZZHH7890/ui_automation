package com.zzkg.page.address;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zzkg.common.Log;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddAddressPage {
	// �ջ�������
	@FindBy(id = "com.geometry:id/et_user_name")
	public WebElement contactInputBox;

	// �Ա���
	@FindBy(id = "com.geometry:id/rb_man")
	public WebElement man;

	// �Ա�Ů
	@FindBy(id = "com.geometry:id/rb_woman")
	public WebElement woman;

	// �ջ�����ϵ�绰
	@FindBy(id = "com.geometry:id/et_phone")
	public WebElement phoneInputBox;

	// ¥����Ϣ
	@FindBy(id = "com.geometry:id/tv_build")
	public WebElement building;

	// ���ƺ�
	@FindBy(id = "com.geometry:id/et_house_number")
	public WebElement roomInputBox;

	// ���水ť
	@FindBy(id = "com.geometry:id/menu_save")
	public WebElement save;

	public AndroidDriver driver;

	public AddAddressPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}

	// ��ȡѡ��¥����Ϣҳ��
	public ChooseBuildingPage getChooseBuildingPage() {
		this.building.click();
		return new ChooseBuildingPage(driver);
	}

	// ���ӵ�ַ
	public void addAddress(String contact, String gender, String phone, String room) {
		Log.startTestCase("������д�ջ���ַ��Ϣ");
		this.contactInputBox.sendKeys(contact);
		Log.info("�����ջ���������" + contact);
		switch (gender) {
		case "man":
			this.man.click();
			break;
		case "woman":
			this.woman.click();
			break;
		}
		Log.info("ѡ���ջ����Ա�" + gender);
		this.phoneInputBox.sendKeys(phone);
		Log.info("�����ջ�����ϵ�绰��" + phone);
		this.roomInputBox.sendKeys(room);
		Log.info("�����ջ������ƺţ�" + room);
		this.save.click();
		Log.endTestCase("��д�ջ���ַ��Ϣ����");
	}

	// ��ȡҳ��Դ��
	public String getAddAddressPageSource() {
		return this.driver.getPageSource();
	}
}
