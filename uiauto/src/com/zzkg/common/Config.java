package com.zzkg.common;

public class Config {
	// 测试的手机系统：iOS，Android，FirefoxOS
	public static final String PLATFORM_NAME = "Android";
	// deviceName,安卓不起作用
	public static final String DEVICE_NAME = "HUAWEP8";
	// 连接的物理设备的唯一设备标识
	public static final String HUAWEP8_UDID = "R8V7N16115005018";
	// 手机操作系统版本
	public static final String PLATFORM_VERSION = "6.0";
	// 设置支持中文，使用 Unicode 输入法
	public static final String UNICODE_KEYBOARD = "true";
	public static final String RESET_KEYBOARD = "true";
	// 设置每次运行不重新设置app，比如登录
	public static final String NO_RESET = "true";
	// (iOS) 删除整个模拟器目录。(Android) 通过卸载——而不是清空数据——来重置应用状态
	public static final String FULL_RESET = "false";
	// 跳过检查和对应用进行 debug 签名的步骤
	public static final String NO_SIGN = "false";

	public static final String SESSION_OVERRIDE = "true";
	// Android应用的包名
	public static final String APP_PACKAGE = "com.geometry";
	// 应用包中启动的 Android Activity 名称
	public static final String APP_ACTIVITY = "com.geometry.ui.launcher.LauncherActivity";
	// 达到超时时间仍未接收到新的命令时 Appium 会假设客户端退出然后自动结束会话
	public static final String NEW_COMMAND_TIMEOUT = "300";

	public static final String APPIUM_HOST = "http://0.0.0.0:4723/wd/hub";

}
