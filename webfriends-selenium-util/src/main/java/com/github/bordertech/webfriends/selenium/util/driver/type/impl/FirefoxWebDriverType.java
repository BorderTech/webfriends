package com.github.bordertech.webfriends.selenium.util.driver.type.impl;

import com.github.bordertech.webfriends.selenium.util.driver.type.WebDriverType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

/**
 * WebDriverType implementation for Firefox.
 * <p>
 * Subclasses can override to alter the configuration or change the implementation.
 * </p>
 */
public class FirefoxWebDriverType implements WebDriverType<FirefoxDriver, FirefoxOptions, GeckoDriverService> {

	@Override
	public String getDriverTypeName() {
		return "firefox";
	}

	@Override
	public FirefoxDriver getDriverInstance() {
		return new FirefoxDriver(getDriverService(), getOptions());
	}

	@Override
	public FirefoxOptions getDefaultOptions() {
		FirefoxOptions opt = new FirefoxOptions();
		opt.addPreference("browser.startup.homepage", "about:blank");
		opt.addPreference("startup.homepage_welcome_url", "about:blank");
		opt.addPreference("startup.homepage_welcome_url.additional", "about:blank");
		return opt;
	}

	@Override
	public GeckoDriverService getDriverService() {
		return GeckoDriverService.createDefaultService();
	}
}
