package test;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class NewTest {
	AndroidDriver driver = null;

	@Test
	public void f() {

		System.out.println("������");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("���Կ�ʼ");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "R8V7N16115005018");
		capabilities.setCapability("udid", "R8V7N16115005018");
		capabilities.setCapability("platformVersion", "6.0");
		// ����֧������
		capabilities.setCapability("unicodeKeyboard", "True");
		capabilities.setCapability("resetKeyboard", "True");
		// ����ÿ�����в���������app�������¼
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability("fullReset", "false");
		capabilities.setCapability("noSign", "true");

		// ��װApp
		// File classpathRootFile = new File(System.getProperty("user.dir"));
		// File appDir = new File(classpathRootFile, "app");
		// File app = new File(appDir, "app-debug-0728.apk");
		// System.out.println(app.toString());
		// capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("sessionOverride", true);
		// ���ö�����û�в����͹ص�Appium session
		// capabilities.setCapability("newCommandTimeout", 20);
		capabilities.setCapability("appPackage", "com.geometry");
		capabilities.setCapability("appActivity", "com.geometry.ui.launcher.LauncherActivity");
		try {
			System.out.print("here");
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//			driver.closeApp();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public void afterClass() {
		System.out.println("���Խ���");
	}

}
