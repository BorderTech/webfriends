package com.github.bordertech.webfriends.api.common.form.category;

import com.github.bordertech.webfriends.api.common.category.Category;

/**
 * Element is associated to a form.
 * <p>
 * Element with content that contains elements that have a form owner, exposed by a form attribute. A form owner is either the containing form element
 * or the element whose id is specified in the form attribute
 * </p>
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Content_categories#form-associated_content">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#categories">HTML Spec</a>
 */
public interface FormAssociated extends Category {

	/**
	 * @return the name of the element to use in the form API
	 */
	String getName();
}
