package com.github.bordertech.webfriends.selenium.element.form.select;

import com.github.bordertech.webfriends.api.element.form.select.HOptGroup;
import com.github.bordertech.webfriends.selenium.common.form.capability.DisableableSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import java.util.List;
import com.github.bordertech.webfriends.selenium.common.tags.STagOptGroup;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElementSelenium;

/**
 * Selenium group options element.
 */
public class SOptGroup extends AbstractSElement implements HOptGroup, ContainerElementSelenium,
		DisableableSelenium {

	private List<SOption> options = null;

	@Override
	public STagOptGroup getTagType() {
		return SeleniumTags.OPTGROUP;
	}

	@Override
	public String getLabel() {
		return getAttribute("label");
	}

	@Override
	public List<? extends SOption> getOptions() {
		if (options == null) {
			options = findWebFriends(SeleniumTags.OPTION);
		}
		return options;
	}
}
