package com.github.bordertech.webfriends.api.idiom.messages;

import com.github.bordertech.webfriends.api.element.Element;
import java.util.List;

/**
 * Element with info messages.
 */
public interface MessagesInfo extends Element {

	/**
	 * @return true if has info messages
	 */
	boolean hasInfoMessages();

	/**
	 * @param message the info message to check
	 * @return true if has info message
	 */
	boolean hasInfoMessage(final String message);

	/**
	 * @return the list of info messages
	 */
	List<String> getInfoMessages();

}
