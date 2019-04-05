package com.github.bordertech.webfriends.selenium.element.interactive;

import com.github.bordertech.webfriends.api.element.interactive.HDialog;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithChildren;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagDialog;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium dialog element.
 */
public class SDialog extends AbstractSElement implements HDialog,
		ContainerWithChildren {

	@Override
	public STagDialog getTagType() {
		return SeleniumTags.DIALOG;
	}

	@Override
	public String getDialogTitle() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isOpen() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void show() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void showModal() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void close() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
