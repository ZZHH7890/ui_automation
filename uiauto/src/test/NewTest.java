package test;

import org.testng.annotations.Test;

import com.zzkg.common.Init;
import com.zzkg.page.HomePage;
import com.zzkg.page.LoginPage;
import com.zzkg.page.MePage;
import com.zzkg.page.address.AddAddressPage;
import com.zzkg.page.address.AddressListPage;
import com.zzkg.page.address.ChooseBuildingPage;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;

public class NewTest {
	AndroidDriver driver = null;

	@Test
	public void test() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		MePage mePage = homePage.getMePage();
		LoginPage loginPage = mePage.getLoginPage();
		loginPage.login();
//		Thread.sleep(5000);
//		AddressListPage addressListPage = mePage.getAddressListPage();
//		AddAddressPage addAddressPage = addressListPage.getAddAddressPage();
//		ChooseBuildingPage chooseBuildingPage = addAddressPage.getChooseBuildingPage();
//		chooseBuildingPage.getBuilding("×Ô¶¯»¯²âÊÔÂ¥¶°D¶°(ÎðÉ¾)");
	}

	@BeforeClass
	public void beforeClass() {
		driver = Init.setAndroidDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.closeApp();
	}

}
