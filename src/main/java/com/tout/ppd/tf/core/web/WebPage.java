package com.tout.ppd.tf.core.web;

import org.openqa.selenium.WebDriver;

import com.tout.ppd.tf.core.Config;
import com.tout.ppd.tf.core.Environment;

public abstract class WebPage<T extends WebPage<T>> extends Component<T>{
	
	private static final Environment ENV = Config.getConfig().getEnvironmentSettings();
	protected static final String BASE_URL = ENV.schema + "://" + ENV.host + ":" + ENV.port;

	public WebPage(WebDriver driver) {
		super(driver);
	}
	
	public abstract T load();
	
	public T loadAndWaitUntilAvailable(){
		T page = load();
		waitUntilAvailable();
		return page;
	}

}
