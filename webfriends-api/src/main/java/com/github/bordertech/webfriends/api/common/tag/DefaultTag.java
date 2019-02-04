package com.github.bordertech.webfriends.api.common.tag;

import com.github.bordertech.webfriends.api.element.Element;
import com.github.bordertech.webfriends.api.element.form.input.InputElement;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Default element tag.
 *
 * @param <T> the element type
 */
public class DefaultTag<T extends Element> implements ElementTag<T> {

	private final Class<T> tagClass;
	private final String tagName;
	private final List<Qualifier> qualifiers;

	public DefaultTag(final Class<T> tagClass, final InputElement.InputType inputType) {
		this(tagClass, "input", Qualifier.create("type", inputType.getToken()));
	}

	public DefaultTag(final Class<T> tagClass, final String tagName, final Qualifier... qualifiers) {
		this.tagClass = tagClass;
		this.tagName = tagName;
		if (qualifiers.length == 0) {
			this.qualifiers = Collections.emptyList();
		} else {
			this.qualifiers = Arrays.asList(qualifiers);
		}
	}

	@Override
	public Class<T> getTagClass() {
		return tagClass;
	}

	@Override
	public String getTagName() {
		return tagName;
	}

	@Override
	public List<Qualifier> getQualifiers() {
		return qualifiers;
	}

}
