package com.github.bordertech.webfriends.api.element.table;

import com.github.bordertech.webfriends.api.common.category.NoCategory;
import com.github.bordertech.webfriends.api.common.context.CustomContext;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.tags.TagCaption;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Caption element.
 * <p>
 * The caption element must be the first element child of a table element.
 * </p>
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/caption">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-caption-element">HTML Spec</a>
 */
public interface HCaption extends NoCategory, CustomContext, FlowModel {

	@Override
	TagCaption getTagType();

	/**
	 * @return the caption text
	 */
	String getCaptionText();

	@Override
	default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(HTable.class);
	}

}
