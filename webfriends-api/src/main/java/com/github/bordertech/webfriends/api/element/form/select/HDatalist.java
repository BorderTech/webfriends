package com.github.bordertech.webfriends.api.element.form.select;

import com.github.bordertech.webfriends.api.common.category.ScriptSupporting;
import com.github.bordertech.webfriends.api.common.combo.PhrasingPalpableElement;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.ScriptSupportingModel;
import com.github.bordertech.webfriends.api.common.tags.TagDatalist;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Data list element (ie suggestions).
 */
public interface HDatalist extends PhrasingPalpableElement, ScriptSupportingModel, CustomModel {

	@Override
	TagDatalist getTagType();

	/**
	 * @return the list of options (ie suggestions)
	 */
	List<? extends HOption> getOptions();

	@Override
	default List<Class<? extends Element>> getChildrenAllowed() {
		return Arrays.asList(HOption.class, ScriptSupporting.class);
	}

}
