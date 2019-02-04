package com.github.bordertech.webfriends.selenium.util.driver.type;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriverService;
import org.openqa.selenium.safari.SafariOptions;

/**
 * WebDriverType implementation for Safair.
 * <p>
 * Subclasses can override to alter the configuration or change the implementation.
 * </p>
 */
public class SafariWebDriverType implements WebDriverType<SafariDriver, SafariOptions, SafariDriverService> {

	@Override
	public String getDriverTypeName() {
		return "safari";
	}

	@Override
	public SafariDriver getDriverInstance() {
		return new SafariDriver(getDriverService(), getOptions());
	}

	@Override
	public SafariOptions getDefaultOptions() {
		return new SafariOptions();
	}

	@Override
	public SafariDriverService getDriverService() {
		return SafariDriverService.createDefaultService();
	}

}
