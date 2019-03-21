package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagInputFileUpload;
import com.github.bordertech.webfriends.selenium.element.form.input.SFileUpload;

/**
 * HTML <code>input</code> fileupload tag.
 */
public class STagInputFileUpload extends AbstractInputTag<SFileUpload> implements TagInputFileUpload<SFileUpload> {

	/**
	 * Default constructor.
	 */
	public STagInputFileUpload() {
		super(SFileUpload.class);
	}

}
