package com.github.bordertech.webfriends.api.element.form;

import com.github.bordertech.webfriends.api.common.capability.Focusable;
import com.github.bordertech.webfriends.api.common.category.InteractiveContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.category.PhrasingContent;
import com.github.bordertech.webfriends.api.common.context.PhrasingContext;
import com.github.bordertech.webfriends.api.common.form.category.LabelableContent;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.PhrasingModel;
import com.github.bordertech.webfriends.api.common.tags.TagLabel;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Label element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/label">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-label-element">HTML Spec</a>
 */
public interface HLabel extends PhrasingContent, PalpableContent, InteractiveContent,
		PhrasingContext,
		PhrasingModel, CustomModel,
		Focusable {

	@Override
	TagLabel getTagType();

	/**
	 * @return the label text for a form control
	 */
	String getLabelText();

	/**
	 * @return the for attribute id, or null if nested
	 */
	String getForId();

	/**
	 * @return true if labeled element is nested
	 */
	boolean isNested();

	/**
	 * @return the element the label is associated with
	 */
	LabelableContent getLabeledElement();

	@Override
	default List<Class<? extends Element>> getDescendantsExcluded() {
		// TODO Needs to handle if it is the element this label is for....
		return Arrays.asList(LabelableContent.class, HLabel.class);
	}

}
