package com.github.bordertech.webfriends.selenium.element.form.select;

import com.github.bordertech.webfriends.api.element.form.select.HDatalist;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithButtons;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithChildren;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagDatalist;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import java.util.List;

/**
 * Selenium data list element (ie suggestions).
 */
public class SDatalist extends AbstractSElement implements HDatalist,
		ContainerWithChildren, ContainerWithButtons {

	private List<? extends SOption> options;

	@Override
	public STagDatalist getTagType() {
		return SeleniumTags.DATALIST;
	}

	@Override
	public List<? extends SOption> getOptions() {
		if (options == null) {
			options = findWebFriends(SeleniumTags.OPTION);
		}
		return options;
	}

}
