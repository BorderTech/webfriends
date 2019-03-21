package com.github.bordertech.webfriends.selenium.element.table;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.Element;
import com.github.bordertech.webfriends.api.element.table.CellElement;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElementSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Selenium table cell element.
 */
public interface CellElementSelenium extends CellElement, ContainerElementSelenium {

	@Override
	TagTypeSelenium<? extends CellElementSelenium> getTagType();

	@Override
	default <T extends Element> T getCellContentAs(final TagType<T> tag) {
		return (T) getCellContentAs((TagTypeSelenium) tag);
	}

	/**
	 * @param <T> the element type
	 * @param tag the element tag
	 * @return the element or null
	 */
	default <T extends SElement> T getCellContentAs(final TagTypeSelenium<T> tag) {
		return findWebFriend(tag);
	}

	@Override
	default Integer getColSpan() {
		return getAttributeAsInteger("colspan");
	}

	@Override
	default Integer getRowSpan() {
		return getAttributeAsInteger("rowspan");
	}

}
