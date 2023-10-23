package com.github.bordertech.webfriends.selenium.element.interactive;

import com.github.bordertech.webfriends.api.element.interactive.HDetails;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithButtons;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithChildren;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagDetails;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium details element.
 */
public class SDetails extends AbstractSElement implements HDetails,
		ContainerWithChildren, ContainerWithButtons {

	@Override
	public STagDetails getTagType() {
		return SeleniumTags.DETAILS;
	}



}
