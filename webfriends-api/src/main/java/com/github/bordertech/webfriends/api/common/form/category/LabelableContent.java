package com.github.bordertech.webfriends.api.common.form.category;

import com.github.bordertech.webfriends.api.common.category.Category;

/**
 * Elements that can be associated with label elements.
 * <p>
 * Elements like meter and progress are labelable but are not form associated.
 * </p>
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Content_categories#labelable">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#categories">HTML Spec</a>
 */
public interface LabelableContent extends Category {
}
