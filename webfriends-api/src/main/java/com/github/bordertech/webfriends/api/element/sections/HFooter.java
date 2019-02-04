package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.combo.FlowPalpableElement;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Footer element.
 */
public interface HFooter extends FlowPalpableElement, CustomModel {

	@Override
	public default ElementTag<? extends HFooter> getElementTag() {
		return StandardTags.FOOTER;
	}

	@Override
	public default List<Class<? extends Element>> getDescendantsExcluded() {
		return Arrays.asList(HHeader.class, HFooter.class);
	}

}
