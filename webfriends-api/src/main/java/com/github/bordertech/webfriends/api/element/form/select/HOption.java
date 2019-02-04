package com.github.bordertech.webfriends.api.element.form.select;

import com.github.bordertech.webfriends.api.common.category.NoCategory;
import com.github.bordertech.webfriends.api.common.context.CustomContext;
import com.github.bordertech.webfriends.api.common.form.capability.Disableable;
import com.github.bordertech.webfriends.api.common.model.TextModel;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Option element.
 */
public interface HOption extends NoCategory, CustomContext, TextModel,
		Disableable {

	@Override
	public default ElementTag<? extends HOption> getElementTag() {
		return StandardTags.OPTION;
	}

	/**
	 * @return the value for form submission
	 */
	String getValue();

	/**
	 * @return the label of the option
	 */
	String getLabel();

	/**
	 * @return true if selected
	 */
	boolean isSelected();

	/**
	 * @return the index of the option in the select options list
	 */
	int getOptionIndex();

	/**
	 * @param selected true if this option is selected.
	 */
	void setSelected(final boolean selected);

	@Override
	public default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(HSelect.class, HDatalist.class, HOptGroup.class);
	}

}
