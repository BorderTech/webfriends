package com.github.bordertech.webfriends.api.element.form.select;

import com.github.bordertech.webfriends.api.common.category.NoCategory;
import com.github.bordertech.webfriends.api.common.category.ScriptSupporting;
import com.github.bordertech.webfriends.api.common.context.CustomContext;
import com.github.bordertech.webfriends.api.common.form.capability.Disableable;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.ScriptSupportingModel;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Group of options with a common label.
 */
public interface HOptGroup extends NoCategory, CustomContext, ScriptSupportingModel, CustomModel,
		Disableable {

	@Override
	public default ElementTag<? extends HOptGroup> getElementTag() {
		return StandardTags.OPTGROUP;
	}

	/**
	 * @return the group label
	 */
	String getLabel();

	/**
	 * @return the options in the group
	 */
	List<? extends HOption> getOptions();

	@Override
	public default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(HSelect.class);
	}

	@Override
	public default List<Class<? extends Element>> getChildrenAllowed() {
		return Arrays.asList(HOption.class, ScriptSupporting.class);
	}

}
