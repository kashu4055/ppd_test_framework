package com.tout.ppd.tf.core;

import static com.tout.ppd.tf.core.Config.setGlobalEnvironment;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public abstract class BaseTest {
	
	protected static WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	@Parameters({"browser", "environment"})
	public void setUp(@Optional("firefox") String browser, @Optional("dev") String environment){
		driver = DriverMaster.getWebdriver(browser);
		setGlobalEnvironment(environment);
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
	
}
