package com.github.bordertech.webfriends.api.common.category;

/**
 * Element that is Sectioning content.
 * <p>
 * Sectioning content defines the scope of headings and footers. Each sectioning content element potentially has a heading and an outline.
 * </p>
 * <p>
 * Sectioning content elements are always considered subsections of their nearest ancestor sectioning root or their nearest ancestor element of
 * sectioning content, whichever is nearest, regardless of what implied sections other headings may have created.
 * </p>
 */
public interface SectioningContent extends FlowContent {

	/**
	 * @return the section title
	 */
	String getSectionTitle();

}
