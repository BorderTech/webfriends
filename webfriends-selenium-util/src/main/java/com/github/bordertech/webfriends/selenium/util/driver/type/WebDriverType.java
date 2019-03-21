package com.github.bordertech.webfriends.selenium.util.driver.type;

import com.github.bordertech.webfriends.selenium.util.driver.ConfigUtilProperties;
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
	 * @return the DesiredCapabilities configured from parameters.
	 */
	default M getOptions() {
		// Get default options
		M capabilities = getDefaultOptions();
		// Merge any ocerride options
		Properties props = getOverrideOptions();
		for (Map.Entry<Object, Object> property : props.entrySet()) {
			capabilities.setCapability((String) property.getKey(), property.getValue());
		}
		return capabilities;
	}

	/**
	 * @return the default driver properties from properties file
	 */
	default Properties getOverrideOptions() {
		return ConfigUtilProperties.getDriverCapabilities(getDriverTypeName());
	}

	/**
	 * @return the driver service
	 */
	D getDriverService();

}
