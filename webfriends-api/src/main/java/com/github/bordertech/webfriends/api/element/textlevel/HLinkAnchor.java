package com.github.bordertech.webfriends.api.element.textlevel;

import com.github.bordertech.webfriends.api.common.attribute.WindowTarget;
import com.github.bordertech.webfriends.api.common.capability.Focusable;
import com.github.bordertech.webfriends.api.common.category.InteractiveContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.category.PhrasingContent;
import com.github.bordertech.webfriends.api.common.context.PhrasingContext;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.model.TransparentModel;
import com.github.bordertech.webfriends.api.common.tags.TagA;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * HyperLink element.
 * <p>
 * If the element has a HREF attribute then the content is Interactive. The content model is Transparent, but there must
 * be no interactive content or a element descendants.
 * </p>
 */
public interface HLinkAnchor extends PhrasingContent, InteractiveContent, PalpableContent,
		PhrasingContext, TransparentModel, FlowModel, CustomModel, Focusable {

	@Override
	TagA getTagType();

	/**
	 * @return the URL
	 */
	String getHref();

	/**
	 * Target can be a predefined or custom.
	 *
	 * @return the window target
	 * @see WindowTarget
	 */
	String getLinkTarget();

	/**
	 * @return the optional file name if file is downloaded
	 */
	String getDownloadFileName();

	/**
	 * @return the optional MIME type of the resource
	 */
	String getMimeType();

	@Override
	public default List<Class<? extends Element>> getDescendantsExcluded() {
		return Arrays.asList(InteractiveContent.class, HLinkAnchor.class);
	}

}
