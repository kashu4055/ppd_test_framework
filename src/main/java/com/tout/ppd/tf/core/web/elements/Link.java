package com.tout.ppd.tf.core.web.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tout.ppd.tf.core.web.WebComponent;

public class Link extends WebComponent<Link>{

	public Link(WebDriver driver, By findByMethod) {
		super(driver, findByMethod);
	}

	public String getUrl(){
		return getWebElement().getAttribute("href");
	}
	
}
