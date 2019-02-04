package com.github.bordertech.webfriends.api.element.form.other;

import com.github.bordertech.webfriends.api.common.category.SectioningRoot;
import com.github.bordertech.webfriends.api.common.combo.FlowPalpableElement;
import com.github.bordertech.webfriends.api.common.form.capability.Disableable;
import com.github.bordertech.webfriends.api.common.form.category.AutocapitalizeInheriting;
import com.github.bordertech.webfriends.api.common.form.category.Listed;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Fieldset element.
 */
public interface HFieldSet extends FlowPalpableElement, SectioningRoot,
		Listed, AutocapitalizeInheriting, Disableable {

	@Override
	public default ElementTag<? extends HFieldSet> getElementTag() {
		return StandardTags.FIELDSET;
	}

	/**
	 * Legend text is either phrasing or a Heading Element.
	 *
	 * @return the legend text
	 */
	String getLegendText();

}
