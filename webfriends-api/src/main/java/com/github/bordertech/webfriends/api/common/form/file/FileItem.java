package com.github.bordertech.webfriends.api.common.form.file;

import java.io.Serializable;

/**
 * File item details.
 */
public interface FileItem extends Serializable {

	/**
	 * @return the file name
	 */
	String getFileName();

	/**
	 * @return the mime type
	 */
	String getMimeType();

	/**
	 * @return the file size
	 */
	int getSize();

	/**
	 * @return the file content
	 */
	byte[] getContent();

}
