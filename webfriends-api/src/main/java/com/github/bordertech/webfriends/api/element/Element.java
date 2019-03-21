package com.github.bordertech.webfriends.api.element;

import com.github.bordertech.webfriends.api.common.context.ElementContext;
import com.github.bordertech.webfriends.api.common.model.ElementModel;
import java.util.List;
import com.github.bordertech.webfriends.api.common.tag.TagType;

/**
 * Base element (No defined category, No context and No model).
 */
public interface Element extends ElementContext, ElementModel {

	/**
	 * @return the element tag details
	 */
	TagType getTagType();

	/**
	 * @return the unique ID of the element
	 */
	String getId();

	/**
	 * @return a style as defined by the CSS Style Attributes specification
	 */
	String getStyle();

	/**
	 * @return the CSS class attribute
	 */
	String getCssClass();

	/**
	 * @return the list of CSS classes on this element
	 */
	List<String> getCssClasses();

	/**
	 * @param cssClass the CSS class to check
	 * @return true if this element has the CSS class
	 */
	boolean hasCssClass(final String cssClass);

	/**
	 * @return true if element is hidden
	 */
	boolean isHidden();

	/**
	 * @return the advisory information (hint) for this element
	 */
	String getTitle();
}
