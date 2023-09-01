package com.github.bordertech.webfriends.selenium.util.driver.type.impl;

import com.github.bordertech.webfriends.selenium.util.driver.ConfigUtilProperties;
import com.github.bordertech.webfriends.selenium.util.driver.type.WebDriverType;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
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
		if (isWebDriverManagerEnabled()) {
			WebDriverManager.firefoxdriver().setup();
		}
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
	public void handleOverrideArguments(final FirefoxOptions options) {
		// Check for argument overrides from Parameters
		List<String> arguments = ConfigUtilProperties.getDriverArguments(getDriverTypeName());
		if (!arguments.isEmpty()) {
			options.addArguments(arguments);
		}
	}

	@Override
	public GeckoDriverService getDriverService() {
		return GeckoDriverService.createDefaultService();
	}
}
