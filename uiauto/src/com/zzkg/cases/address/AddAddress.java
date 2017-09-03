package com.zzkg.cases.address;

import org.testng.annotations.Test;

import com.zzkg.common.Init;
import com.zzkg.common.Log;
import com.zzkg.datapro.AddAddressPro;
import com.zzkg.page.HomePage;
import com.zzkg.page.LoginPage;
import com.zzkg.page.MePage;
import com.zzkg.page.address.AddAddressPage;
import com.zzkg.page.address.AddressListPage;
import com.zzkg.page.address.ChooseBuildingPage;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class AddAddress {
	AndroidDriver driver = null;

	// 测试新增地址
	@Test(enabled = true, dataProvider = "address", dataProviderClass = AddAddressPro.class, priority = 1)
	public void addAddress(String contact, String gender, String phone, String building, String room,
			String expectValue) throws InterruptedException {
		Log.info("addAddress用例开始");
		HomePage homePage = new HomePage(driver);
		MePage mePage = homePage.getMePage();
		AddressListPage addressListPage = mePage.getAddressListPage();
		AddAddressPage addAddressPage = addressListPage.getAddAddressPage();
		ChooseBuildingPage chooseBuildingPage = addAddressPage.getChooseBuildingPage();
		chooseBuildingPage.getBuilding(building);
		addAddressPage.addAddress(contact, gender, phone, room);
		Log.info("addAddress用例结束");
		//检查收货地址列表页面中是否有新加入的地址
		Assert.assertTrue(addressListPage.getAddressListPageSource().contains(expectValue));
	}

	// 检验手机号码段
	@Test(enabled = false, dataProvider = "phone", dataProviderClass = AddAddressPro.class, priority = 2)
	public void checkAddressPhone(String contact, String phone, String expectValue) throws InterruptedException {
		Log.info("checkAddressPhone用例开始");
		HomePage homePage = new HomePage(driver);
		MePage mePage = homePage.getMePage();
		AddressListPage addressListPage = mePage.getAddressListPage();
		AddAddressPage addAddressPage = addressListPage.getAddAddressPage();
		ChooseBuildingPage chooseBuildingPage = addAddressPage.getChooseBuildingPage();
		chooseBuildingPage.getBuilding("自动化测试楼栋C栋(勿删)");
		addAddressPage.addAddress(contact, "man", phone, "111111Aa");
		Log.info("checkAddressPhone用例结束");
		//检查收货地址列表页面中是否有新加入的地址
		Assert.assertTrue(addressListPage.getAddressListPageSource().contains(expectValue));
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = Init.setAndroidDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver.closeApp();
	}

	@BeforeClass
	public void beforeClass() {
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("AddAddress用例测试开始");
	}

	@AfterClass
	public void afterClass() {
		Log.endTestCase("AddAddress用例测试结束");
	}

}
