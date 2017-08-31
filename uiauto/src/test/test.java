package test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.internal.ThreeStateBoolean;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		AndroidDriver driver = null;
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
			Thread.sleep(30000);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement name = driver.findElementById("com.geometry:id/tips_btn");
//		WebElement name = driver.findElementByAndroidUIAutomator("com.geometry:id/tips_btn");
//		WebElement name = driver.findElement(By.id("com.geometry:id/tips_btn"));
//		WebElement name = driver.findElement(By.name("ѡ��С��"));
//		WebElement name = driver.findElementByXPath("//android.widget.Button[@text='ѡ��С��']");
		name.click();
		Thread.sleep(10000);
		
		driver.closeApp();
	}

}
