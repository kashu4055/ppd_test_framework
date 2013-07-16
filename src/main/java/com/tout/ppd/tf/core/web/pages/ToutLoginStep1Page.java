package com.tout.ppd.tf.core.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tout.ppd.tf.core.web.WebPage;
import com.tout.ppd.tf.core.web.elements.Link;

public class ToutLoginStep1Page extends WebPage<ToutLoginStep1Page>{

	private static final By SWITCH_MODE_LINK_LOCATOR = By.xpath("//a[text()='Other']");
	
	public ToutLoginStep1Page(WebDriver driver) {
		super(driver);
	}

	@Override
	public ToutLoginStep1Page load() {
		throw new RuntimeException("ToutLoginStep1Page is not intended to be loaded.");
	}

	@Override
	public boolean isAvailable() {
		return getSwitchModeLink().isAvailable();
	}
	
	public ToutLoginStep2Page switchToOtherMode(){
		getSwitchModeLink().click();
		return new ToutLoginStep2Page(driver).waitUntilAvailable();
	}
	
	private Link getSwitchModeLink(){
		return new Link(driver, SWITCH_MODE_LINK_LOCATOR);
	}
	
}
