package com.github.bordertech.webfriends.api.common.tag;

import com.github.bordertech.webfriends.api.element.form.input.InputElement;
import java.util.Arrays;
import java.util.List;

/**
 * HTML input tag type.
 *
 * @param <T> the input element type
 */
public interface TagInputType<T extends InputElement> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "input";
	}

	/**
	 * @return the input type
	 */
	InputElement.InputType getInputType();

	@Override
	public default List<Qualifier> getQualifiers() {
		return Arrays.asList(Qualifier.create("type", getInputType().getToken()));
	}
}
