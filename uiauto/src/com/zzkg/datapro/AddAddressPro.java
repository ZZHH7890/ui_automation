package com.zzkg.datapro;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.zzkg.common.ReadExcel;


public class AddAddressPro {
	
	//��ȡ���񷵻����ӵ�ַ��������
	@DataProvider(name = "address")
	public static Object[][] addAddressData() throws IOException {
		return ReadExcel.getTestData("C:\\Users\\Administrator\\eclipse-workspace\\ui_automation\\uiauto\\ExcelForData\\", "UiTestData.xlsx", "address");
	}
	
}