package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.common.form.file.FileItem;
import com.github.bordertech.webfriends.api.element.form.input.HFileUpload;
import com.github.bordertech.webfriends.selenium.common.form.capability.ValueMultiSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import java.util.List;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputFileUpload;

/**
 * Selenium file upload element.
 */
public class SFileUpload extends AbstractSElement implements HFileUpload, InputElementSelenium,
		ValueMultiSelenium {

	@Override
	public STagInputFileUpload getTagType() {
		return SeleniumTags.INPUT_FILEUPLOAD;
	}

	@Override
	public List<String> getAccepts() {
		return getAttributeAsList("accepts");
	}

	@Override
	public List<FileItem> getFiles() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void setValues(final List<String> values) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void setValues(final String[] values) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void setValue(final String value) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
