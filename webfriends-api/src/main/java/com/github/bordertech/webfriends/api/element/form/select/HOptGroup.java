package com.github.bordertech.webfriends.api.element.form.select;

import com.github.bordertech.webfriends.api.common.category.NoCategory;
import com.github.bordertech.webfriends.api.common.category.ScriptSupportingContent;
import com.github.bordertech.webfriends.api.common.context.CustomContext;
import com.github.bordertech.webfriends.api.common.form.capability.Disableable;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.ScriptSupportingModel;
import com.github.bordertech.webfriends.api.common.tags.TagOptGroup;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Group of options with a common label.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/optgroup">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-optgroup-element">HTML Spec</a>
 */
public interface HOptGroup extends NoCategory,
		CustomContext,
		ScriptSupportingModel, CustomModel,
		Disableable {

	@Override
	TagOptGroup getTagType();

	/**
	 * @return the group label
	 */
	String getLabel();

	/**
	 * @return the options in the group
	 */
	List<? extends HOption> getOptions();

	@Override
	default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(HSelect.class);
	}

	@Override
	default List<Class<? extends Element>> getChildrenAllowed() {
		return Arrays.asList(HOption.class, ScriptSupportingContent.class);
	}

}
