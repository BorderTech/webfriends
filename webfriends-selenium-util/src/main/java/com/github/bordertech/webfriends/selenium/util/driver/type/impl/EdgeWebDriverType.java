package com.github.bordertech.webfriends.selenium.util.driver.type.impl;

import com.github.bordertech.webfriends.selenium.util.driver.type.WebDriverTypeChromium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;

/**
 * WebDriverType implementation for Edge.
 * <p>
 * Subclasses can override to alter the configuration or change the implementation.
 * </p>
 */
public class EdgeWebDriverType implements WebDriverTypeChromium<EdgeDriver, EdgeOptions, EdgeDriverService> {

	@Override
	public String getDriverTypeName() {
		return "edge";
	}

	@Override
	public EdgeDriver getDriverInstance() {
		if (isWebDriverManagerEnabled()) {
			WebDriverManager.edgedriver().setup();
		}
		return new EdgeDriver(getDriverService(), getOptions());
	}

	@Override
	public EdgeOptions getDefaultOptions() {
		return new EdgeOptions();
	}

	@Override
	public EdgeDriverService getDriverService() {
		return EdgeDriverService.createDefaultService();
	}

}
