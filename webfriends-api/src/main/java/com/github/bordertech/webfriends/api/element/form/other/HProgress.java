package com.github.bordertech.webfriends.api.element.form.other;

import com.github.bordertech.webfriends.api.common.combo.PhrasingPalpableElement;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;
import com.github.bordertech.webfriends.api.element.Element;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Progress element.
 */
public interface HProgress extends PhrasingPalpableElement, CustomModel {

	@Override
	public default ElementTag<? extends HProgress> getElementTag() {
		return StandardTags.PROGRESS;
	}

	/**
	 * @return the current value of the element, or null
	 */
	BigDecimal getValue();

	/**
	 * @return the upper bound of the range, or null
	 */
	BigDecimal getMax();

	@Override
	public default List<Class<? extends Element>> getDescendantsExcluded() {
		return Arrays.asList(HProgress.class);
	}
}
