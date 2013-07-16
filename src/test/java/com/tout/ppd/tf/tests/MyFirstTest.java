package com.tout.ppd.tf.tests;

import org.testng.annotations.Test;

import com.tout.ppd.tf.core.BaseTest;
import com.tout.ppd.tf.core.web.pages.PremiumParterPage;

public class MyFirstTest extends BaseTest{
	
	@Test
	public void someTest(){
		new PremiumParterPage(driver)
			.loadAsAnonymousUser()
			.goToToutLoginPage()
			.loginAsSuperAdmin()
			.logOut();
	}
	
}
