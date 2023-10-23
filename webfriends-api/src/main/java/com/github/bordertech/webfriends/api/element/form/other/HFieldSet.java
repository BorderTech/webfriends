package com.github.bordertech.webfriends.api.element.form.other;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.form.capability.Disableable;
import com.github.bordertech.webfriends.api.common.form.category.AutocapitalizeInheriting;
import com.github.bordertech.webfriends.api.common.form.category.Listed;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.tags.TagFieldSet;

/**
 * Fieldset element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/fieldset">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-fieldset-element">HTML Spec</a>
 */
public interface HFieldSet extends FlowContent, PalpableContent,
		FlowContext,
		FlowModel,
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
