package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element is checkable.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#checked">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#attr-input-checked">HTML Spec</a>
 */
public interface Checkable extends Element {

	/**
	 * @return true if checked
	 */
	boolean isChecked();

	/**
	 * @param checked true if checked
	 */
	void setChecked(final boolean checked);

}
