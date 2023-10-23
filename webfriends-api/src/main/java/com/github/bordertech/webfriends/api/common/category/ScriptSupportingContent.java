package com.github.bordertech.webfriends.api.common.category;

/**
 * Element that supports scripting such as script and template elements.
 * <p>
 * Script-supporting elements are elements which don't directly contribute to the rendered output of a document. Instead, they serve to support
 * scripts, either by containing or specifying script code directly, or by specifying data that will be used by scripts.
 * </p>
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Content_categories#script-supporting_elements">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#script-supporting-elements">HTML Spec</a>
 */
public interface ScriptSupportingContent extends Category {
}
