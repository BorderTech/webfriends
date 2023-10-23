package com.github.bordertech.webfriends.api.element.interactive;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.tags.TagDialog;

/**
 * Dialog element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/dialog">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-dialog-element">HTML Spec</a>
 */
public interface HDialog extends FlowContent, FlowContext, FlowModel {

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
