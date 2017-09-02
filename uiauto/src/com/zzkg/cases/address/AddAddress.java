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

	@Test(enabled = true, dataProvider = "address", dataProviderClass = AddAddressPro.class, priority = 1)
	public void addAddress(String contact, String gender, String phone, String building, String room,
			String expectValue) throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		MePage mePage = homePage.getMePage();
		AddressListPage addressListPage = mePage.getAddressListPage();
		AddAddressPage addAddressPage = addressListPage.getAddAddressPage();
		ChooseBuildingPage chooseBuildingPage = addAddressPage.getChooseBuildingPage();
		chooseBuildingPage.getBuilding(building);
		addAddressPage.addAddress(contact, gender, phone, room);
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
