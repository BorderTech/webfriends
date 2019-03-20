package com.github.bordertech.webfriends.selenium.util.driver.type.impl;

import com.github.bordertech.config.Config;
import com.github.bordertech.webfriends.selenium.util.driver.type.WebDriverType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * WebDriverType implementation for Chrome.
 * <p>
 * Subclasses can override to alter the configuration or change the implementation.
 * </p>
 */
public class ChromeWebDriverType implements WebDriverType<ChromeDriver, ChromeOptions, ChromeDriverService> {

	@Override
	public String getDriverTypeName() {
		return "chrome";
	}

	@Override
	public ChromeDriver getDriverInstance() {
		return new ChromeDriver(getDriverService(), getOptions());
	}

	@Override
	public ChromeOptions getDefaultOptions() {
		return new ChromeOptions();
	}

	@Override
	public ChromeOptions getOptions() {
		ChromeOptions options = WebDriverType.super.getOptions();
		if (Config.getInstance().getBoolean("bordertech.webfriends.chrome.headless", Boolean.FALSE)) {
			options.addArguments("--headless");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-gpu");
			options.addArguments("--dom-automation");
			options.addArguments("--disable-images");
		}
		options.setExperimentalOption("useAutomationExtension", false);
		return options;
	}

	@Override
	public ChromeDriverService getDriverService() {
		return ChromeDriverService.createDefaultService();
	}

}
