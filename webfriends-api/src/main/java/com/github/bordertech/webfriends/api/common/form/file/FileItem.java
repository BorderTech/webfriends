package com.github.bordertech.webfriends.api.common.form.file;

/**
 * File item details.
 */
public interface FileItem {

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
