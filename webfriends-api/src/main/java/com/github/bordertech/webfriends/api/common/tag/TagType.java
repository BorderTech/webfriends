package com.github.bordertech.webfriends.api.common.tag;

import com.github.bordertech.webfriends.api.element.Element;
import java.util.Collections;
import java.util.List;

/**
 * The HTML element tag type.
 *
 * @param <T> the element type
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Glossary/Tag">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#syntax-tags">HTML Spec</a>
 */
public interface TagType<T extends Element> {

	/**
	 * @return the web friends interface class for this tag
	 */
	Class<T> getElementClass();

	/**
	 * @return the HTML tag name for this element
	 */
	String getTagName();

	/**
	 * @return the unique key for this element tag
	 */
	default String getKey() {
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
	default List<Qualifier> getQualifiers() {
		return Collections.emptyList();
	}

	/**
	 * @return true if has qualifiers
	 */
	default boolean hasQualifiers() {
		return !getQualifiers().isEmpty();
	}

}
