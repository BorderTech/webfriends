package com.github.bordertech.webfriends.api.element.table;

import com.github.bordertech.webfriends.api.common.attribute.AttributeToken;
import com.github.bordertech.webfriends.api.common.category.NoCategory;
import com.github.bordertech.webfriends.api.common.tags.TagTH;
import org.apache.commons.lang3.StringUtils;

/**
 * Table header cell (ie th element).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/th">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-th-element">HTML Spec</a>
 */
public interface HHeaderCell extends CellElement, NoCategory {

	@Override
	TagTH getTagType();

	/**
	 * Scope type.
	 */
	enum ScopeType implements AttributeToken {
		ROW("row"),
		COL("col"),
		ROW_GROUP("rowgroup"),
		COL_GROUP("colgroup"),
		AUTO("auto");

		/**
		 * Attribute key.
		 */
		public static final String ATTR = "scope";

		private final String token;

		/**
		 * @param token the attribute token
		 */
		private ScopeType(final String token) {
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
		public static ScopeType findType(final String token) {
			if (token == null) {
				return null;
			}
			for (ScopeType type : ScopeType.values()) {
				if (StringUtils.equalsIgnoreCase(type.getToken(), token)) {
					return type;
				}
			}
			return null;
		}
	}

	/**
	 * @return the header text (ie column heading)
	 */
	String getHeaderText();

	/**
	 * @return true if this column is currently sorted
	 */
	boolean isSorted();

	/**
	 * @return true if sorted ascending
	 */
	boolean isAscending();

	/**
	 * @return true if this column can be sorted
	 */
	boolean isSortable();

}
