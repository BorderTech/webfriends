package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.form.other.HFieldSet;

/**
 * HTML <code>fieldset</code> tag.
 *
 * @param <T> the element type
 */
public interface TagFieldSet<T extends HFieldSet> extends TagType<T> {

	@Override
	default String getTagName() {
		return "fieldset";
	}

}
