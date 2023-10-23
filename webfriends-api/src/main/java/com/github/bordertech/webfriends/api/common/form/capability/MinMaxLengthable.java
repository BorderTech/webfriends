package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that has min and max lengths.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/maxlength">Web Docs maxlength</a>
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/minlength">Web Docs minlength</a>
 * @see <a href="https://html.spec.whatwg.org/#limiting-user-input-length:-the-maxlength-attribute">HTML Spec maxlength</a>
 * @see <a href="https://html.spec.whatwg.org/#setting-minimum-input-length-requirements:-the-minlength-attribute">HTML Spec minlength</a>
 */
public interface MinMaxLengthable extends Element {

	/**
	 * @return the minimum number of characters a user can input, or null
	 */
	Integer getMinLength();

	/**
	 * @return the maximum number of characters a user can input, or null
	 */
	Integer getMaxLength();

}
