package com.tout.ppd.tf.core.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tout.ppd.tf.core.Config;
import com.tout.ppd.tf.core.Environment;
import com.tout.ppd.tf.core.web.WebPage;
import com.tout.ppd.tf.core.web.elements.Button;
import com.tout.ppd.tf.core.web.elements.TextInput;

public class ToutLoginStep2Page extends WebPage<ToutLoginStep2Page>{
	private static final Environment ENV = Config.getConfig().getEnvironmentSettings();
	private static final By EMAIL_INPUT_LOCATOR = By.id("signin_user_email");
	private static final By PASSWORD_INPUT_LOCATOR = By.id("signin_user_password");
	private static final By SIGN_IN_BUTTON_LOCATOR = By.name("commit");
	
	public ToutLoginStep2Page(WebDriver driver) {
		super(driver);
	}

	@Override
	public ToutLoginStep2Page load() {
		throw new RuntimeException("ToutLoginStep2Page is not intended to be loaded.");
	}

	@Override
	public boolean isAvailable() {
		return getEmailInput().isAvailable() &&
				getPasswordInput().isAvailable() &&
				getSignInButton().isAvailable();
	}
	
	public void loginAsSuperAdmin(){
		getEmailInput().inputText(ENV.sadmin_login);
		getPasswordInput().inputText(ENV.sadmin_password);
		getSignInButton().click();
	}
	
	private TextInput getEmailInput(){
		return new TextInput(driver, EMAIL_INPUT_LOCATOR);
	}
	
	private TextInput getPasswordInput(){
		return new TextInput(driver, PASSWORD_INPUT_LOCATOR);
	}
	
	private Button getSignInButton(){
		return new Button(driver, SIGN_IN_BUTTON_LOCATOR);
	}
	
}
