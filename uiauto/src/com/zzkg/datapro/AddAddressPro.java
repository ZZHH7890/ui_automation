package com.zzkg.datapro;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.zzkg.common.ReadExcel;

public class AddAddressPro {

	// 读取表格返回增加地址测试数据
	@DataProvider(name = "address")
	public static Object[][] addAddressData() throws IOException {
		return ReadExcel.getTestData(
				"C:\\Users\\Administrator\\eclipse-workspace\\ui_automation\\uiauto\\ExcelForData\\", "UiTestData.xlsx",
				"address");
	}

	// 读取表格返回收货人姓名，收货人电话号码，期望值
	@DataProvider(name = "phone")
	public static Object[][] addAddressPhoneData() throws IOException {
		return ReadExcel.getTestData("C:\\Users\\Administrator\\eclipse-workspace\\ui_automation\\uiauto\\ExcelForData\\",
				"UiTestData.xlsx", "phone");
	}

}
