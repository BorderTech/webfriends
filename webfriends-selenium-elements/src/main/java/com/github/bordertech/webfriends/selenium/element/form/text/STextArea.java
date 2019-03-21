package com.github.bordertech.webfriends.selenium.element.form.text;

import com.github.bordertech.webfriends.api.element.form.text.HTextArea;
import com.github.bordertech.webfriends.selenium.common.form.control.FormTextControlSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagTextArea;

/**
 * Selenium TextArea element.
 */
public class STextArea extends AbstractSElement implements HTextArea, FormTextControlSelenium {

	@Override
	public STagTextArea getTagType() {
		return SeleniumTags.TEXTAREA;
	}

	@Override
	public int getCols() {
		Integer cols = getAttributeAsInteger("cols");
		return cols == null ? -1 : cols;
	}

	@Override
	public int getRows() {
		Integer rows = getAttributeAsInteger("rows");
		return rows == null ? -1 : rows;
	}

	@Override
	public WrapType getWrapType() {
		return getAttributeToken("wrap", WrapType.values());
	}

	@Override
	public String getTextValue() {
		return getValue();
	}

}
