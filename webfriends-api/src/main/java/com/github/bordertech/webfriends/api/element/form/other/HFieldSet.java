package com.github.bordertech.webfriends.api.element.form.other;

import com.github.bordertech.webfriends.api.common.category.SectioningRoot;
import com.github.bordertech.webfriends.api.common.combo.FlowPalpableElement;
import com.github.bordertech.webfriends.api.common.form.capability.Disableable;
import com.github.bordertech.webfriends.api.common.form.category.AutocapitalizeInheriting;
import com.github.bordertech.webfriends.api.common.form.category.Listed;
import com.github.bordertech.webfriends.api.common.tags.TagFieldSet;

/**
 * Fieldset element.
 */
public interface HFieldSet extends FlowPalpableElement, SectioningRoot,
		Listed, AutocapitalizeInheriting, Disableable {

	@Override
	TagFieldSet getTagType();

	/**
	 * Legend text is either phrasing or a Heading Element.
	 *
	 * @return the legend text
	 */
	String getLegendText();

}
