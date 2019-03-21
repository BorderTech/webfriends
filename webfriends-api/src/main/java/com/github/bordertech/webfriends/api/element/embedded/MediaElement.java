package com.github.bordertech.webfriends.api.element.embedded;

import com.github.bordertech.webfriends.api.common.attribute.AttributeNumericToken;
import com.github.bordertech.webfriends.api.common.attribute.AttributeToken;
import com.github.bordertech.webfriends.api.common.capability.Focusable;
import com.github.bordertech.webfriends.api.common.category.EmbeddedContent;
import com.github.bordertech.webfriends.api.common.category.InteractiveContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.EmbeddedContext;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.TransparentModel;
import com.github.bordertech.webfriends.api.common.tag.TagMediaType;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * Element that has media (e.g. Video, Audio) source.
 * <p>
 * Interactive and Palpable content if the element has a controls attribute.
 * </p>
 * <p>
 * If the element has a src attribute: zero or more track elements, then transparent model, but with no media element
 * descendants.
 * </p>
 * <p>
 * If the element does not have a src attribute: zero or more source elements, then zero or more track elements, then
 * transparent model, but with no media element descendants.
 * </p>
 */
public interface MediaElement extends EmbeddedContent, InteractiveContent, PalpableContent,
		EmbeddedContext, TransparentModel, CustomModel, Focusable {

	/**
	 * Pre-load media type.
	 */
	enum PreloadType implements AttributeToken {
		NONE(""),
		METADATA(""),
		AUTO("");

		/**
		 * Attribute key.
		 */
		public static final String ATTR = "preload";

		private final String token;

		/**
		 * @param token the token
		 */
		private PreloadType(final String token) {
			this.token = token;
		}

		@Override
		public String getToken() {
			return token;
		}

		/**
		 * @param token the token to match
		 * @return the matching type
		 */
		public static PreloadType findType(final String token) {
			if (token == null) {
				return null;
			}
			for (PreloadType type : PreloadType.values()) {
				if (StringUtils.equalsIgnoreCase(type.getToken(), token)) {
					return type;
				}
			}
			return null;
		}
	}

	/**
	 * Media error.
	 */
	enum MediaErrorType implements AttributeNumericToken {
		ABORTED(0),
		NETWORK(1),
		DECODE(2),
		SRC_NOT_SUPPORTED(3);

		/**
		 * Attribute key.
		 */
		public static final String ATTR = "code";

		private final Integer token;

		/**
		 * @param token the token
		 */
		private MediaErrorType(final Integer token) {
			this.token = token;
		}

		@Override
		public Integer getToken() {
			return token;
		}

		/**
		 * @param token the token to match
		 * @return the matching type
		 */
		public static MediaErrorType findType(final Integer token) {
			if (token == null) {
				return null;
			}
			for (MediaErrorType type : MediaErrorType.values()) {
				if (token.equals(type.getToken())) {
					return type;
				}
			}
			return null;
		}

	}

	/**
	 * Network state.
	 */
	enum NetworkStateType implements AttributeNumericToken {
		EMPTY(0),
		IDLE(1),
		LOADING(2),
		NO_SOURCE(3);

		/**
		 * Attribute key.
		 */
		public static final String ATTR = "networkstate";

		private final Integer token;

		/**
		 * @param token the token
		 */
		private NetworkStateType(final Integer token) {
			this.token = token;
		}

		@Override
		public Integer getToken() {
			return token;
		}

		/**
		 * @param token the token to match
		 * @return the matching type
		 */
		public static NetworkStateType findType(final Integer token) {
			if (token == null) {
				return null;
			}
			for (NetworkStateType type : NetworkStateType.values()) {
				if (token.equals(type.getToken())) {
					return type;
				}
			}
			return null;
		}
	}

	@Override
	TagMediaType getTagType();

	/**
	 * @return the address of the resource
	 */
	String getSourceUrl();

	/**
	 * @return true if source URL attribute
	 */
	boolean hasSourceUrl();

	/**
	 * @return the resource mime type
	 */
	String getMimeType();

	/**
	 * @return the hints for buffering or null
	 */
	PreloadType getPreloadType();

	/**
	 * @return true if use agent controls
	 */
	boolean isUseAgentControls();

	/**
	 * @return true if auto play
	 */
	boolean isAutoPlay();

	/**
	 * @return true if loop
	 */
	boolean isLoop();

	/**
	 * @return true if muted by default
	 */
	boolean isMuted();

	/**
	 * @return true if if playback is paused
	 */
	boolean isPaused();

	/**
	 * @return true if if playback has ended
	 */
	boolean isEnded();

	/**
	 * @return true if played
	 */
	boolean played();

	/**
	 * @return the media tracks
	 */
	List<? extends HTrack> getTracks();

	/**
	 * @return true if has tracks
	 */
	boolean hasTracks();

	/**
	 * @return the default track or null
	 */
	HTrack findDefaultTrack();

	/**
	 * @param label the label of the track
	 * @return the track or null
	 */
	HTrack findTrackByLabel(final String label);

	/**
	 * @param kindType the kind of track
	 * @return the track or null
	 */
	HTrack findTrackByKind(final HTrack.KindType kindType);

	/**
	 * @return the media sources
	 */
	List<? extends HSource> getSources();

	/**
	 * @return true if has sources
	 */
	boolean hasSources();

	/**
	 * @return the error type
	 */
	MediaErrorType getMediaError();

	/**
	 * @return the media error message
	 */
	String getErrorMessage();

	/**
	 * @return the network state
	 */
	NetworkStateType getNetworkState();

	/**
	 * @param muted true if mute the media
	 */
	void setMuted(final boolean muted);

	/**
	 * Load the media.
	 */
	void load();

	/**
	 * Start the media playback.
	 */
	void play();

	/**
	 * Pause the media playback.
	 */
	void pause();

	@Override
	public default List<Class<? extends Element>> getDescendantsExcluded() {
		return Arrays.asList(MediaElement.class);
	}

}
