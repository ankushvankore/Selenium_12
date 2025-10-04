package com.WebTests;

import org.testng.annotations.Test;

public class D04DataProviderDemo {
	@Test(dataProvider = "getData", dataProviderClass = com.WebTests.D03ReadingFromExcel.class)
	public void showDetails(String un, String ps, String rs, String ms) {
		System.out.println(un + "\t" + ps + "\t" + rs + "\t" + ms);
	}
}
