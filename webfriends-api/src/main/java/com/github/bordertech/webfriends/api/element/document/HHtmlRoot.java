package com.github.bordertech.webfriends.api.element.document;

import com.github.bordertech.webfriends.api.common.category.NoCategory;
import com.github.bordertech.webfriends.api.common.context.NoContext;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;
import com.github.bordertech.webfriends.api.element.Element;
import com.github.bordertech.webfriends.api.element.metadata.HHead;
import com.github.bordertech.webfriends.api.element.sections.HBody;
import java.util.Arrays;
import java.util.List;

/**
 * The root element of an HTML document (ie HTML element).
 */
public interface HHtmlRoot extends NoCategory, NoContext, CustomModel {

	@Override
	public default ElementTag<? extends HHtmlRoot> getElementTag() {
		return StandardTags.HTML;
	}

	/**
	 * @return the head element of the document
	 */
	HHead getHead();

	/**
	 * @return the body element of the document
	 */
	HBody getBody();

	/**
	 * @return the address of the applications cache manifest or null
	 */
	String getManifestUrl();

	@Override
	public default List<Class<? extends Element>> getChildrenAllowed() {
		return Arrays.asList(HHead.class, HBody.class);
	}

}
