package com.github.bordertech.webfriends.api.element.form;

import com.github.bordertech.webfriends.api.common.capability.Focusable;
import com.github.bordertech.webfriends.api.common.category.InteractiveContent;
import com.github.bordertech.webfriends.api.common.category.Labelable;
import com.github.bordertech.webfriends.api.common.combo.PhrasingPalpableElement;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Label element.
 */
public interface HLabel extends PhrasingPalpableElement, InteractiveContent, CustomModel, Focusable {

	@Override
	public default ElementTag<? extends HLabel> getElementTag() {
		return StandardTags.LABEL;
	}

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
	Labelable getLabeledElement();

	@Override
	public default List<Class<? extends Element>> getDescendantsExcluded() {
		// TODO Needs to handle if it is the element this label is for....
		return Arrays.asList(Labelable.class, HLabel.class);
	}

}
