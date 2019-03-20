package com.github.bordertech.webfriends.selenium.smart.driver;

import com.github.bordertech.config.Config;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.configuration.Configuration;

/**
 * This class contains references to all constants and configuration options.
 */
public final class ConfigSmartProperties {

	/**
	 * Private constructor for static class.
	 */
	private ConfigSmartProperties() {
		//No-impl
	}

	private static final List<String> DEFAULT_TEXT_SEARCH_ATTRIBUTES = Arrays.asList("title", "aria-label");

	/**
	 * The list of attributes to check on an element on text searches.
	 */
	private static final String TEXT_SEARCH_ATTRIBUTES = "bordertech.webfriends.selenium.text.search.attributes";

	/**
	 * Shorthand convenience method to get the Configuration instance.
	 *
	 * @return the Configuration instance.
	 */
	private static Configuration get() {
		return Config.getInstance();
	}

	/**
	 * @return the default attributes to search for text
	 */
	public static List<String> getTextSearchAttributes() {
		// TODO Dont really like this
		return (List<String>) (List<?>) get().getList(TEXT_SEARCH_ATTRIBUTES, DEFAULT_TEXT_SEARCH_ATTRIBUTES);
	}

}
