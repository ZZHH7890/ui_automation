package com.zzkg.common;

public class Config {
	// ���Ե��ֻ�ϵͳ��iOS��Android��FirefoxOS
	public static final String PLATFORM_NAME = "Android";
	// deviceName,��׿��������
	public static final String DEVICE_NAME = "HUAWEP8";
	// ���ӵ������豸��Ψһ�豸��ʶ
	public static final String HUAWEP8_UDID = "R8V7N16115005018";
	// �ֻ�����ϵͳ�汾
	public static final String PLATFORM_VERSION = "6.0";
	// ����֧�����ģ�ʹ�� Unicode ���뷨
	public static final String UNICODE_KEYBOARD = "true";
	public static final String RESET_KEYBOARD = "true";
	// ����ÿ�����в���������app�������¼
	public static final String NO_RESET = "true";
	// (iOS) ɾ������ģ����Ŀ¼��(Android) ͨ��ж�ء���������������ݡ���������Ӧ��״̬
	public static final String FULL_RESET = "false";
	// �������Ͷ�Ӧ�ý��� debug ǩ���Ĳ���
	public static final String NO_SIGN = "false";

	public static final String SESSION_OVERRIDE = "true";
	// AndroidӦ�õİ���
	public static final String APP_PACKAGE = "com.geometry";
	// Ӧ�ð��������� Android Activity ����
	public static final String APP_ACTIVITY = "com.geometry.ui.launcher.LauncherActivity";
	// �ﵽ��ʱʱ����δ���յ��µ�����ʱ Appium �����ͻ����˳�Ȼ���Զ������Ự
	public static final String NEW_COMMAND_TIMEOUT = "300";

	public static final String APPIUM_HOST = "http://0.0.0.0:4723/wd/hub";

}
