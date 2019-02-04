package com.github.bordertech.webfriends.api.common.model;

/**
 * Element with a transparent content model (Marker interface).
 * <p>
 * The content model of a transparent element is derived from the content model of its parent element: the elements required in the part of the
 * content model that is "transparent" are the same elements as required in the part of the content model of the parent of the transparent element in
 * which the transparent element finds itself.
 * </p>
 */
public interface TransparentModel extends AllowedModel {
}
