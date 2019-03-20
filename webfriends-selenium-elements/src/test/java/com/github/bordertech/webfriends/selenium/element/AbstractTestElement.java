package com.github.bordertech.webfriends.selenium.element;

import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.smart.junit.AbstractFriendTestCase;
import org.junit.Before;

/**
 * Abstract class for testing a selenium element.
 *
 * @param <T> the element type being tested
 */
public abstract class AbstractTestElement<T extends SElement> extends AbstractFriendTestCase {

	private T element = null;

	@Before
	public void setupPage() {
		if (element == null) {
			navigateToPath(getElementPath());
			element = getDriver().findWebFriend(getTag());
			if (element == null) {
				throw new IllegalStateException("Test element cannot be found");
			}
		}
	}

	/**
	 * @return the element being tested
	 */
	protected T getTestElement() {
		return element;
	}

	/**
	 * @return the tag of the element being tested
	 */
	protected abstract SeleniumTag<T> getTag();

	/**
	 * @return the path of the test HTML for the element
	 */
	protected abstract String getElementPath();
}
