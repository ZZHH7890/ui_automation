package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		AndroidDriver driver = null;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "R8V7N16115005018");
		capabilities.setCapability("udid", "R8V7N16115005018");
		capabilities.setCapability("platformVersion", "6.0");
		// 设置支持中文
		capabilities.setCapability("unicodeKeyboard", "True");
		capabilities.setCapability("resetKeyboard", "True");
		// 设置每次运行不重新设置app，比如登录
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability("fullReset", "false");
		capabilities.setCapability("noSign", "true");

		// 安装App
		// File classpathRootFile = new File(System.getProperty("user.dir"));
		// File appDir = new File(classpathRootFile, "app");
		// File app = new File(appDir, "app-debug-0728.apk");
		// System.out.println(app.toString());
		// capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("sessionOverride", true);
		// 设置多少秒没有操作就关掉Appium session
		// capabilities.setCapability("newCommandTimeout", 20);
		capabilities.setCapability("appPackage", "com.geometry");
		capabilities.setCapability("appActivity", "com.geometry.ui.launcher.LauncherActivity");
		try {
			System.out.print("here");
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			Thread.sleep(10000);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement name = driver.findElementById("com.geometry:id/account_tab");
		name.click();
		Thread.sleep(5000);
		driver.findElementById("com.geometry:id/tv_login").click();
		Thread.sleep(5000);
		driver.findElementById("com.geometry:id/phoneEdit").sendKeys("13714672776");
		driver.findElementById("com.geometry:id/verifyCodeEdit").sendKeys("1234");
		driver.findElementById("com.geometry:id/loginBtn").click();
		Thread.sleep(1000);
		driver.findElementById("com.geometry:id/iv_user_icon").click();
		Thread.sleep(1000);
		driver.findElementById("com.geometry:id/logout").click();
		Thread.sleep(1000);
		driver.findElementById("android:id/button1").click();
		driver.closeApp();
	}
}
