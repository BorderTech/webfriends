package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.Qualifier;
import com.github.bordertech.webfriends.api.common.tag.TagImageType;
import com.github.bordertech.webfriends.api.element.embedded.HImageMap;
import java.util.Arrays;
import java.util.List;

/**
 * HTML <code>img</code> map tag.
 *
 * @param <T> the element type
 */
public interface TagImgMap<T extends HImageMap> extends TagImageType<T> {

	@Override
	public default List<Qualifier> getQualifiers() {
		return Arrays.asList(Qualifier.create("usemap", ""));
	}

}
