package com.github.bordertech.webfriends.api.element.form.other;

import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.category.PhrasingContent;
import com.github.bordertech.webfriends.api.common.context.PhrasingContext;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.PhrasingModel;
import com.github.bordertech.webfriends.api.common.tags.TagProgress;
import com.github.bordertech.webfriends.api.element.Element;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Progress element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/progress">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-progress-element">HTML Spec</a>
 */
public interface HProgress extends PhrasingContent, PalpableContent,
		PhrasingContext,
		PhrasingModel, CustomModel {

	@Override
	TagProgress getTagType();

	/**
	 * @return the current value of the element, or null
	 */
	BigDecimal getValue();

	/**
	 * @return the upper bound of the range, or null
	 */
	BigDecimal getMax();

	@Override
	default List<Class<? extends Element>> getDescendantsExcluded() {
		return Arrays.asList(HProgress.class);
	}
}
