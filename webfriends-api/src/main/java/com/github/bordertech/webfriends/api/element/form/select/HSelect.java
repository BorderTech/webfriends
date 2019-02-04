package com.github.bordertech.webfriends.api.element.form.select;

import com.github.bordertech.webfriends.api.common.category.ScriptSupporting;
import com.github.bordertech.webfriends.api.common.form.capability.Autocompleteable;
import com.github.bordertech.webfriends.api.common.form.capability.Sizeable;
import com.github.bordertech.webfriends.api.common.form.capability.ValueMulti;
import com.github.bordertech.webfriends.api.common.form.control.FormControl;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.ScriptSupportingModel;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Select element.
 *
 * @param <T> the option type
 */
public interface HSelect<T extends HOption> extends FormControl, ScriptSupportingModel, CustomModel,
		Autocompleteable, Sizeable, ValueMulti {

	@Override
	public default ElementTag<? extends HSelect> getElementTag() {
		return StandardTags.SELECT;
	}

	/**
	 * @return the list of options (including options in option groups)
	 */
	List<T> getOptions();

	/**
	 * @return the list of option groups
	 */
	List<T> getOptGroups();

	/**
	 * @param idx the option index
	 * @return the option at this index position in the options list
	 */
	HOption getOptionByIndex(final int idx);

	/**
	 * @param name the id or name of the option to return
	 * @return the first item with the ID or name that matches the name, or null
	 */
	HOption getOptionByName(final String name);

	/**
	 * @return the first selected option, or null
	 */
	HOption getSelectedOption();

	/**
	 * @return the list of selected options
	 */
	List<T> getSelectedOptions();

	/**
	 * @param option the options to select
	 */
	void setSelectedOption(final T option);

	/**
	 * @param options the options to select
	 */
	void setSelectedOptions(final T... options);

	@Override
	public default List<Class<? extends Element>> getChildrenAllowed() {
		return Arrays.asList(HOption.class, HOptGroup.class, ScriptSupporting.class);
	}
}
