package com.tout.ppd.tf.core.web.pages;

import org.openqa.selenium.WebDriver;

import com.tout.ppd.tf.core.web.WebPage;

public class PremiumParterPage extends WebPage<PremiumParterPage>{
		
	public PremiumParterPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public PremiumParterPage load() {
		driver.get(BASE_URL);
		return this;
	}

	@Override
	public boolean isAvailable() {
		return true;
	}

	public ToutHomePage loadAsAnonymousUser(){
		load();
		return new ToutHomePage(driver).waitUntilAvailable();
	}
	
}
