package com.github.bordertech.webfriends.api.idiom.messages;

import com.github.bordertech.webfriends.api.element.Element;
import java.util.List;

/**
 * Element with error messages.
 */
public interface MessagesError extends Element {

	/**
	 * @return true if has error messages
	 */
	boolean hasErrorMessages();

	/**
	 * @param message the error message to check
	 * @return true if has error message
	 */
	boolean hasErrorMessage(final String message);

	/**
	 * @return the list of error messages
	 */
	List<String> getErrorMessages();

}
