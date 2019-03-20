package com.github.bordertech.webfriends.selenium.element.table;

import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.element.Element;
import com.github.bordertech.webfriends.api.element.table.CellElement;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElement;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Selenium table cell element.
 */
public interface CellElementSelenium extends CellElement, ContainerElement {

	@Override
	public SeleniumTag<? extends CellElementSelenium> getElementTag();

	@Override
	public default <T extends Element> T getCellContentAs(final ElementTag<T> tag) {
		return (T) getCellContentAs((SeleniumTag) tag);
	}

	/**
	 * @param <T> the element type
	 * @param tag the element tag
	 * @return the element or null
	 */
	public default <T extends SElement> T getCellContentAs(final SeleniumTag<T> tag) {
		return findWebFriend(tag);
	}

	@Override
	public default Integer getColSpan() {
		return getAttributeAsInteger("colspan");
	}

	@Override
	public default Integer getRowSpan() {
		return getAttributeAsInteger("rowspan");
	}

}
