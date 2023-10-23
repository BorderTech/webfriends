package com.github.bordertech.webfriends.api.common.model;

/**
 * The element must contain no Text nodes and no element nodes.
 * <p>
 * Most HTML elements whose content model is "nothing" are also, for convenience, void elements (elements that have no end tag).
 * </p>
 *
 * @see <a href="https://html.spec.whatwg.org/#the-nothing-content-model">HTML Spec</a>
 */
public interface NothingContentModel extends ElementModel {
}
