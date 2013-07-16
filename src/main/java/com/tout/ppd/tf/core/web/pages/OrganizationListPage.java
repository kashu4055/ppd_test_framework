package com.tout.ppd.tf.core.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.tout.ppd.tf.core.web.WebPage;
import com.tout.ppd.tf.core.web.elements.Button;
import com.tout.ppd.tf.core.web.elements.Link;

public class OrganizationListPage extends WebPage<OrganizationListPage>{

	private static final String PAGE_URL = BASE_URL + "/organizations";
	private static final By USER_MENU_BUTTON_LOCATOR = By.xpath("id('login')/a");
	private static final By NEW_ORGANIZATION_BUTTON_LOCATOR = By.xpath("//a[text()='+ New']");
	private static final By LOGOUT_LINK_LOCATOR = By.xpath("//a[text()='Logout']");
	
	public OrganizationListPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public OrganizationListPage load() {
		driver.get(PAGE_URL);
		return this;
	}

	@Override
	public boolean isAvailable() {
		return getUserMenuButton().isAvailable() &&
				getNewOrganizationButton().isAvailable() &&
				getlogOutLink().isAvailable();
	}
	
	public ToutHomePage logOut() {
		driver.get(BASE_URL + "/sign_out");
		return new ToutHomePage(driver).waitUntilAvailable();
	}

	private Link getUserMenuButton(){
		return new Link(driver, USER_MENU_BUTTON_LOCATOR);
	}
	
	private Button getNewOrganizationButton() {
		return new Button(driver, NEW_ORGANIZATION_BUTTON_LOCATOR);
	}
	
	private Link getlogOutLink(){
		return new Link(driver, LOGOUT_LINK_LOCATOR);
	}
	
	
	
}
