package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.tags.TagHeader;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Header element represents a group of introductory or navigational aids.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/header">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-header-element">HTML Spec</a>
 */
public interface HHeader extends FlowContent, PalpableContent, FlowContext, FlowModel, CustomModel {

	@Override
	TagHeader getTagType();

	/**
	 * @return the header text
	 */
	String getHeaderText();

	@Override
	default List<Class<? extends Element>> getDescendantsExcluded() {
		return Arrays.asList(HHeader.class, HFooter.class);
	}

}
