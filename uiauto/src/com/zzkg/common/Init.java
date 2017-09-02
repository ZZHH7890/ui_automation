package com.zzkg.common;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Init {
	// ����Appium
	public static AndroidDriver setAndroidDriver() {
		AndroidDriver driver = null;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", Config.PLATFORM_NAME);
		capabilities.setCapability("deviceName", Config.DEVICE_NAME);
		capabilities.setCapability("udid", Config.HUAWEP8_UDID);
		capabilities.setCapability("platformVersion", Config.PLATFORM_VERSION);
		// ����֧������
		capabilities.setCapability("unicodeKeyboard", Config.UNICODE_KEYBOARD);
		capabilities.setCapability("resetKeyboard", Config.RESET_KEYBOARD);
		// ����ÿ�����в���������app�������¼
		capabilities.setCapability("noReset", Config.NO_RESET);
		capabilities.setCapability("fullReset", Config.FULL_RESET);
		capabilities.setCapability("noSign", Config.NO_SIGN);
		// ���ö�����û�в����͹ص�Appium session
		capabilities.setCapability("newCommandTimeout", Config.NEW_COMMAND_TIMEOUT);
		capabilities.setCapability("appPackage", Config.APP_PACKAGE);
		capabilities.setCapability("appActivity", Config.APP_ACTIVITY);
		try {
			driver = new AndroidDriver(new URL(Config.APPIUM_HOST), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}

}
