package com.tout.ppd.tf.core.web.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tout.ppd.tf.core.web.WebComponent;

public class Button extends WebComponent<Button>{

	public Button(WebDriver driver, By findByMethod) {
		super(driver, findByMethod);
	}

}
