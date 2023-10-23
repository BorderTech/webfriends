package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that has a place holder.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/placeholder">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-placeholder-attribute">HTML Spec</a>
 */
public interface Placeholderable extends Element {

	/**
	 * @return a short hint intended to aid the user, or null
	 */
	String getPlaceholder();

}
