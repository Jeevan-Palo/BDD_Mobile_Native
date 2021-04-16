package com.palo.techtest.StepLibrary;

import com.palo.techtest.Constant.SearchProductConst;

public class SearchProductLibrary extends CommonLibrary {

	public static void searchValue(String arg1) throws Exception {

		try {
			if (device.equalsIgnoreCase("mobile")) {
				isElementPresentVerification(SearchProductConst.SEARCH_TXTBOX);
				clearAndEnterText_NativeApp(SearchProductConst.SEARCH_TXTBOX, arg1);
			}
		} catch (Exception e) {
			throw new Exception("not matching");
		}
	}

}
