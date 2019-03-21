package com.github.bordertech.webfriends.api.element.interactive;

import com.github.bordertech.webfriends.api.common.category.SectioningRoot;
import com.github.bordertech.webfriends.api.common.combo.FlowElement;
import com.github.bordertech.webfriends.api.common.tags.TagDialog;

/**
 * Dialog element.
 */
public interface HDialog extends FlowElement, SectioningRoot {

	@Override
	TagDialog getTagType();

	/**
	 * @return the dialog title
	 */
	String getDialogTitle();

	/**
	 * @return true if open
	 */
	boolean isOpen();

	/**
	 * Display the dialog element.
	 */
	void show();

	/**
	 * Display the dialog element and make it the top-most modal dialog.
	 */
	void showModal();

	/**
	 * Close the dialog.
	 */
	void close();
}
