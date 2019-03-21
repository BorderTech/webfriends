package com.github.bordertech.webfriends.selenium.element.embedded;

import com.github.bordertech.webfriends.api.element.embedded.HTrack;
import com.github.bordertech.webfriends.api.element.embedded.MediaElement;
import com.github.bordertech.webfriends.selenium.common.capability.FocusableSelenium;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElementSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tag.TagMediaTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import java.util.List;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

/**
 * Selenium media element.
 */
public abstract class MediaElementSelenium extends AbstractSElement implements MediaElement, ContainerElementSelenium,
		FocusableSelenium {

	private List<? extends STrack> tracks = null;
	private List<? extends SSource> sources = null;

	@Override
	public abstract TagMediaTypeSelenium getTagType();

	@Override
	public List<? extends STrack> getTracks() {
		if (tracks == null) {
			tracks = findWebFriends(SeleniumTags.TRACK);
		}
		return tracks;
	}

	@Override
	public List<? extends SSource> getSources() {
		if (sources == null) {
			sources = findWebFriends(SeleniumTags.SOURCE);
		}
		return sources;
	}

	@Override
	public boolean hasTracks() {
		return !getTracks().isEmpty();
	}

	@Override
	public boolean hasSources() {
		return !getSources().isEmpty();
	}

	@Override
	public STrack findDefaultTrack() {
		// TODO Could be done with specific BY
		for (STrack track : getTracks()) {
			if (track.isDefaultTrack()) {
				return track;
			}
		}
		return null;
	}

	@Override
	public STrack findTrackByLabel(final String label) {
		// TODO Could be done with specific BY
		for (STrack track : getTracks()) {
			if (StringUtils.equalsIgnoreCase(label, track.getTrackLabel())) {
				return track;
			}
		}
		return null;
	}

	@Override
	public STrack findTrackByKind(final HTrack.KindType kindType) {
		// TODO Could be done with specific BY
		for (STrack track : getTracks()) {
			if (Objects.equals(track.getKind(), kindType)) {
				return track;
			}
		}
		return null;
	}

	@Override
	public String getSourceUrl() {
		return getAttribute("src");
	}

	@Override
	public boolean hasSourceUrl() {
		return getSourceUrl() != null;
	}

	@Override
	public String getMimeType() {
		return getAttribute("mime");
	}

	@Override
	public PreloadType getPreloadType() {
		return getAttributeToken(PreloadType.ATTR, PreloadType.values());
	}

	@Override
	public boolean isUseAgentControls() {
		return getAttributeAsBoolean("controls");
	}

	@Override
	public boolean isAutoPlay() {
		return getAttributeAsBoolean("autoplay");
	}

	@Override
	public boolean isLoop() {
		return getAttributeAsBoolean("loop");
	}

	@Override
	public boolean isMuted() {
		return getAttributeAsBoolean("muted");
	}

	@Override
	public boolean isPaused() {
		return getAttributeAsBoolean("paused");
	}

	@Override
	public boolean isEnded() {
		return getAttributeAsBoolean("ended");
	}

	@Override
	public boolean played() {
		return getAttributeAsBoolean("played");
	}

	@Override
	public MediaErrorType getMediaError() {
		return getAttributeNumericToken(MediaErrorType.ATTR, MediaErrorType.values());
	}

	@Override
	public NetworkStateType getNetworkState() {
		return getAttributeNumericToken(NetworkStateType.ATTR, NetworkStateType.values());
	}

	@Override
	public String getErrorMessage() {
		return getAttribute("message");
	}

	@Override
	public void setMuted(final boolean muted) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void load() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void play() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void pause() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
