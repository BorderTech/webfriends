package com.github.bordertech.webfriends.api.idiom.messages;

import com.github.bordertech.webfriends.api.element.Element;
import java.util.List;

/**
 * Element with warning messages.
 */
public interface MessagesWarn extends Element {

	/**
	 * @return true if has warning messages
	 */
	boolean hasWarnMessages();

	/**
	 * @param message the warning message to check
	 * @return true if has warning message
	 */
	boolean hasWarnMessage(final String message);

	/**
	 * @return the list of warning messages
	 */
	List<String> getWarnMessages();
}
