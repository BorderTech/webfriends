package com.github.bordertech.webfriends.api.element.form.select;

import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.category.PhrasingContent;
import com.github.bordertech.webfriends.api.common.category.ScriptSupportingContent;
import com.github.bordertech.webfriends.api.common.context.PhrasingContext;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.PhrasingModel;
import com.github.bordertech.webfriends.api.common.model.ScriptSupportingModel;
import com.github.bordertech.webfriends.api.common.tags.TagDatalist;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Data list element (ie suggestions).
 */
public interface HDatalist extends PhrasingContent, PalpableContent,
		PhrasingContext,
		PhrasingModel, ScriptSupportingModel, CustomModel {

	@Override
	TagDatalist getTagType();

	/**
	 * @return the list of options (ie suggestions)
	 */
	List<? extends HOption> getOptions();

	@Override
	default List<Class<? extends Element>> getChildrenAllowed() {
		return Arrays.asList(HOption.class, ScriptSupportingContent.class);
	}

}
