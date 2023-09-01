package com.github.bordertech.webfriends.selenium.util.driver.type;

import com.github.bordertech.webfriends.selenium.util.driver.ConfigUtilProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Map;
import java.util.Properties;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;

/**
 * Superclass representing a possible WebDriver implementation to use for Selenium testing.
 *
 * @param <T> the type of WebDriver returned
 * @param <M> the options for the driver
 * @param <D> the driver service
 */
public interface WebDriverType<T extends WebDriver, M extends MutableCapabilities, D extends DriverService> {

	/**
	 * <p>
	 * Return a new instance of the WebDriver for this type.</p>
	 * <p>
	 * Must return a new instance each time - must not cache.</p>
	 *
	 * @return a new instance of the WebDriver.
	 */
	T getDriverInstance();

	/**
	 * @return a unique name String for this driver type.
	 */
	String getDriverTypeName();

	/**
	 * @return the default options for this driver type.
	 */
	M getDefaultOptions();

	/**
	 * @return the options with the desired capabilities and arguments configured from parameters.
	 */
	default M getOptions() {
		// Get default options
		M options = getDefaultOptions();
		handleOverrideCapabilities(options);
		handleOverrideArguments(options);
		return options;
	}

	/**
	 * Handle overriding capabilities from parameters.
	 *
	 * @param options the options to update
	 */
	default void handleOverrideCapabilities(M options) {
		// Check for capability overrides from Parameters
		Properties props = ConfigUtilProperties.getDriverCapabilities(getDriverTypeName());
		for (Map.Entry<Object, Object> property : props.entrySet()) {
			options.setCapability((String) property.getKey(), property.getValue());
		}
	}

	/**
	 * Handle overriding arguments from parameters.
	 *
	 * @param options the options to update
	 */
	void handleOverrideArguments(M options);

	/**
	 * @return the driver service
	 */
	D getDriverService();

	/**
	 * @return true if {@link WebDriverManager} should be used before creating the driver instance
	 */
	default boolean isWebDriverManagerEnabled() {
		return ConfigUtilProperties.isWebDriverManagerEnabled();
	}

}
