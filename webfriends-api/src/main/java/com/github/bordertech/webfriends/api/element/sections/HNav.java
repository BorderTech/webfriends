package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.category.SectioningContent;
import com.github.bordertech.webfriends.api.common.combo.FlowPalpableElement;
import com.github.bordertech.webfriends.api.common.tags.TagNav;

/**
 * Nav element.
 */
public interface HNav extends FlowPalpableElement, SectioningContent {

	@Override
	TagNav getTagType();

}
