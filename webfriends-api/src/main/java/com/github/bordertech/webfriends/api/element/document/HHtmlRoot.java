package com.github.bordertech.webfriends.api.element.document;

import com.github.bordertech.webfriends.api.common.category.NoCategory;
import com.github.bordertech.webfriends.api.common.context.NoContext;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.tags.TagHtml;
import com.github.bordertech.webfriends.api.element.Element;
import com.github.bordertech.webfriends.api.element.metadata.HHead;
import com.github.bordertech.webfriends.api.element.sections.HBody;
import java.util.Arrays;
import java.util.List;

/**
 * The root element of an HTML document (ie HTML element).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/html">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-html-element">HTML Spec</a>
 */
public interface HHtmlRoot extends NoCategory, NoContext, CustomModel {

	@Override
	TagHtml getTagType();

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
	default List<Class<? extends Element>> getChildrenAllowed() {
		return Arrays.asList(HHead.class, HBody.class);
	}

}
