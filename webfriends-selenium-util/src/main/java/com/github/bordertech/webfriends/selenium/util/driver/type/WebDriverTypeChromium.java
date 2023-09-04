package com.github.bordertech.webfriends.selenium.util.driver.type;

import com.github.bordertech.webfriends.selenium.util.driver.ConfigUtilProperties;
import java.util.List;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.remote.service.DriverService;

/**
 * WebDriverType for Chromium based drivers.
 *
 * @param <T> the type of WebDriver returned
 * @param <M> the options for the driver
 * @param <D> the driver service
 */
public interface WebDriverTypeChromium<T extends ChromiumDriver, M extends ChromiumOptions, D extends DriverService> extends WebDriverType<T, M, D> {

	@Override
	default void handleOverrideArguments(M options) {
		// Check for argument overrides from Parameters
		List<String> arguments = ConfigUtilProperties.getDriverArguments(getDriverTypeName());
		if (!arguments.isEmpty()) {
			options.addArguments(arguments);
		}
	}

}
