package com.github.bordertech.webfriends.api.idiom.messages;

import com.github.bordertech.webfriends.api.element.Element;
import java.util.List;

/**
 * Element with success messages.
 */
public interface MessagesSuccess extends Element {

	/**
	 * @return true if has success messages
	 */
	boolean hasSuccessMessages();

	/**
	 * @param message the success message to check
	 * @return true if has success message
	 */
	boolean hasSuccessMessage(final String message);

	/**
	 * @return the list of success messages
	 */
	List<String> getSuccessMessages();
}
