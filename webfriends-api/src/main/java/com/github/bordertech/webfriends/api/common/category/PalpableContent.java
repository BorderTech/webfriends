package com.github.bordertech.webfriends.api.common.category;

/**
 * Element that is Palpable content.
 * <p>
 * Content is palpable when it's neither empty or hidden; it is content that is rendered and is substantive. Elements whose model is flow content or
 * phrasing content should have at least one node which is palpable.
 * </p>
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Content_categories#palpable_content">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#palpable-content">HTML Spec</a>
 */
public interface PalpableContent extends Category {
}
