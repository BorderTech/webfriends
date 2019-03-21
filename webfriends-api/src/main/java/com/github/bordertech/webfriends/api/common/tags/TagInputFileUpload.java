package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagInputType;
import com.github.bordertech.webfriends.api.element.form.input.HFileUpload;
import com.github.bordertech.webfriends.api.element.form.input.InputElement;

/**
 * HTML <code>input</code> fileupload tag.
 *
 * @param <T> the element type
 */
public interface TagInputFileUpload<T extends HFileUpload> extends TagInputType<T> {

	@Override
	default InputElement.InputType getInputType() {
		return InputElement.InputType.FILEUPLOAD;
	}

}
