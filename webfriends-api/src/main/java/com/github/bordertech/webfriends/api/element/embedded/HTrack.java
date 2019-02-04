package com.github.bordertech.webfriends.api.element.embedded;

import com.github.bordertech.webfriends.api.common.attribute.AttributeNumericToken;
import com.github.bordertech.webfriends.api.common.attribute.AttributeToken;
import com.github.bordertech.webfriends.api.common.category.NoCategory;
import com.github.bordertech.webfriends.api.common.model.NothingContentModel;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;
import org.apache.commons.lang3.StringUtils;

/**
 * Track element.
 * <p>
 * Child of a media element.
 * </p>
 */
public interface HTrack extends NoCategory, MediaElementContext, NothingContentModel {

	@Override
	public default ElementTag<? extends HTrack> getElementTag() {
		return StandardTags.TRACK;
	}

	/**
	 * Track kind type.
	 */
	enum KindType implements AttributeToken {
		SUBTITLES("subtitles"),
		CAPTIONS("captions"),
		DESCRIPTIONS("descriptions"),
		CHAPTERS("chapters"),
		METADATA("metadata");

		/**
		 * @param token the token
		 */
		private KindType(final String token) {
			this.token = token;
		}

		private final String token;

		@Override
		public String getToken() {
			return token;
		}

		/**
		 * Attribute key.
		 */
		public static final String ATTR = "kind";

		/**
		 * @param token the token to match
		 * @return the matching type
		 */
		public static KindType findType(final String token) {
			if (token == null) {
				return null;
			}
			for (KindType type : KindType.values()) {
				if (StringUtils.equalsIgnoreCase(type.getToken(), token)) {
					return type;
				}
			}
			return null;
		}
	}

	/**
	 * Track ready state.
	 */
	enum ReadyStateType implements AttributeNumericToken {
		NONE(0),
		LOADING(1),
		LOADED(2),
		ERROR(3);

		/**
		 * @param token the token
		 */
		private ReadyStateType(final Integer token) {
			this.token = token;
		}

		private final Integer token;

		@Override
		public Integer getToken() {
			return token;
		}

		/**
		 * Attribute key.
		 */
		public static final String ATTR = "readystate";

		/**
		 * @param token the token to match
		 * @return the matching type
		 */
		public static ReadyStateType findType(final Integer token) {
			if (token == null) {
				return null;
			}
			for (ReadyStateType type : ReadyStateType.values()) {
				if (token.equals(type.getToken())) {
					return type;
				}
			}
			return null;
		}

	}

	/**
	 * @return the kind of track
	 */
	KindType getKind();

	/**
	 * @return the address of the resource
	 */
	String getSourceUrl();

	/**
	 * @return the language of the resource
	 */
	String getLanguage();

	/**
	 * @return the user visible label
	 */
	String getTrackLabel();

	/**
	 * @return true if default track
	 */
	boolean isDefaultTrack();

	/**
	 * @return the ready state of the track
	 */
	ReadyStateType getReadyState();
}
