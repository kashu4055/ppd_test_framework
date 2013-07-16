package com.tout.ppd.tf.core.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tout.ppd.tf.core.web.WebPage;
import com.tout.ppd.tf.core.web.elements.Button;
import com.tout.ppd.tf.core.web.elements.Link;

public class ToutHomePage extends WebPage<ToutHomePage>{

	private static final By LOGIN_LINK_LOCATOR = By.xpath("//a[text()='Login']");
	private static final By NEW_TOUT_BUTTON_LOCATOR = By.id("new_tout");
	private static final By SWITCH_MODE_LINK_LOCATOR = By.xpath("//a[text()='Other']");
	
	public ToutHomePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public ToutHomePage load() {
		throw new RuntimeException("ToutHomePage is not intended to be loaded.");
	}

	@Override
	public boolean isAvailable() {
		return getLoginLink().isAvailable() &&
				getNewToutButton().isAvailable();
	}

	public ToutLoginPage goToToutLoginPage(){
		getSwitchModeLink().click();
		return new ToutLoginPage(driver).waitUntilAvailable();
	}
	
	private Link getLoginLink(){
		return new Link(driver, LOGIN_LINK_LOCATOR);
	}
	
	private Button getNewToutButton() {
		return new Button(driver, NEW_TOUT_BUTTON_LOCATOR);		
	}
	
	private Link getSwitchModeLink(){
		return new Link(driver, SWITCH_MODE_LINK_LOCATOR);
	}
	
}
