package com.tout.ppd.tf.core.web.pages;

import org.openqa.selenium.WebDriver;

import com.tout.ppd.tf.core.Config;
import com.tout.ppd.tf.core.Environment;
import com.tout.ppd.tf.core.web.WebPage;

public class PremiumParterPage extends WebPage<PremiumParterPage>{

	private static final Environment ENV = Config.getConfig().getEnvironmentSettings();
	private static final String PAGE_URL = ENV.schema + "://" + ENV.host + ":" + ENV.port;
	
	public PremiumParterPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public PremiumParterPage load() {
		driver.get(PAGE_URL);
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
