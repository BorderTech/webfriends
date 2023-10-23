package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.capability.ValueMulti;
import com.github.bordertech.webfriends.api.common.form.file.FileItem;
import com.github.bordertech.webfriends.api.common.tags.TagInputFileUpload;
import java.util.List;

/**
 * File upload element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/file">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#file-upload-state-(type=file)">HTML Spec</a>
 */
public interface HFileUpload extends InputElement, ValueMulti {

	@Override
	TagInputFileUpload getTagType();

	@Override
	default InputType getInputType() {
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
