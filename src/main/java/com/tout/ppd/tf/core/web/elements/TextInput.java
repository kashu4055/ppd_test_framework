package com.tout.ppd.tf.core.web.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tout.ppd.tf.core.web.WebComponent;

public class TextInput extends WebComponent<TextInput>{

	public TextInput(WebDriver driver, By findByMethod) {
		super(driver, findByMethod);
	}

	public void inputText(String text){
		getWebElement().sendKeys(text);
	}
	
}
