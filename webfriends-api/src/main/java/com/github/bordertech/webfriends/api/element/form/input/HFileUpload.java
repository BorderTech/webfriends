package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.capability.ValueMulti;
import com.github.bordertech.webfriends.api.common.form.file.FileItem;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;
import java.util.List;

/**
 * File upload element.
 */
public interface HFileUpload extends InputElement, ValueMulti {

	@Override
	public default ElementTag<? extends HFileUpload> getElementTag() {
		return StandardTags.INPUT_FILEUPLOAD;
	}

	@Override
	public default InputType getInputType() {
		return InputType.FILEUPLOAD;
	}

	/**
	 * @return the list of file types accepted
	 */
	List<String> getAccepts();

	/**
	 * @return the list of files to upload
	 */
	List<? extends FileItem> getFiles();

}
