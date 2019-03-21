package com.github.bordertech.webfriends.selenium.element.embedded;

import com.github.bordertech.webfriends.api.element.embedded.HTrack;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagTrack;

/**
 * Selenium track element.
 */
public class STrack extends AbstractSElement implements HTrack {

	@Override
	public STagTrack getTagType() {
		return SeleniumTags.TRACK;
	}

	@Override
	public KindType getKind() {
		return getAttributeToken(KindType.ATTR, KindType.values());
	}

	@Override
	public String getSourceUrl() {
		return getAttribute("src");
	}

	@Override
	public String getLanguage() {
		return getAttribute("srclang");
	}

	@Override
	public String getTrackLabel() {
		return getAttribute("label");
	}

	@Override
	public boolean isDefaultTrack() {
		return getAttributeAsBoolean("default");
	}

	@Override
	public ReadyStateType getReadyState() {
		return getAttributeNumericToken(ReadyStateType.ATTR, ReadyStateType.values());
	}

}
