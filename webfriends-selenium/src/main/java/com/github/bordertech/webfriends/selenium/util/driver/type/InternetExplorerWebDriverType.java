package com.github.bordertech.webfriends.selenium.util.driver.type;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;

/**
 * WebDriverType implementation for Internet Explorer.
 * <p>
 * Subclasses can override to alter the configuration or change the implementation.
 * </p>
 */
public class InternetExplorerWebDriverType implements WebDriverType<InternetExplorerDriver, InternetExplorerOptions, InternetExplorerDriverService> {

	@Override
	public String getDriverTypeName() {
		return "ie";
	}

	@Override
	public InternetExplorerDriver getDriverInstance() {
		return new InternetExplorerDriver(getDriverService(), getOptions());
	}

	@Override
	public InternetExplorerOptions getDefaultOptions() {
		InternetExplorerOptions options = new InternetExplorerOptions();
		// Help with slow typing
		options.introduceFlakinessByIgnoringSecurityDomains();
		options.requireWindowFocus();
		return options;
	}

	@Override
	public InternetExplorerDriverService getDriverService() {
		return InternetExplorerDriverService.createDefaultService();
	}

}
