package com.github.bordertech.webfriends.api.common.tag;

import com.github.bordertech.webfriends.api.element.Element;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * The element tag details.
 *
 * @param <T> the element type
 */
public interface ElementTag<T extends Element> extends Serializable {

	/**
	 * @return the web friends interface class for this tag
	 */
	Class<T> getTagClass();

	/**
	 * @return the HTML tag name for this element
	 */
	String getTagName();

	/**
	 * @return the unique key for this element tag
	 */
	public default String getKey() {
		if (getQualifiers().isEmpty()) {
			return getTagName();
		}
		StringBuilder key = new StringBuilder(getTagName());
		for (Qualifier qualifier : getQualifiers()) {
			key.append("-").append(qualifier.getKey());
			if (qualifier.getValue() != null) {
				key.append("-").append(qualifier.getValue());
			}
			key.append("-").append(qualifier.getPredicate());
		}
		return key.toString();
	}

	/**
	 * Qualifiers for the element.
	 *
	 * @return a list of attribute conditions
	 */
	public default List<Qualifier> getQualifiers() {
		return Collections.emptyList();
	}

	/**
	 * @return true if has qualifiers
	 */
	public default boolean hasQualifiers() {
		return !getQualifiers().isEmpty();
	}

}
