package com.qa.opencart.utils;

import java.util.ArrayList;
import java.util.List;

public class OpenCartConstants {

	public static final String LOGIN_PAGE_TITLE = "Account Login";
	public static final String ACCOUNT_PAGE_TITLE = "My Account";
	public static final String SEARCH_PRODUCT_PAGE_TITLE = "Search";

	public static final List<String> sectionList() {
		List<String> section = new ArrayList<String>();
		section.add("My Account");
		section.add("My Orders");
		section.add("My Affiliate Account");
		section.add("Newsletter");

		return section;
	}

}
