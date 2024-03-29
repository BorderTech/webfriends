package com.github.bordertech.webfriends.api.common.attribute;

/**
 * Target window type.
 *
 * @see <a href="https://html.spec.whatwg.org/#navigable-target-names">HTML Spec</a>
 */
public final class WindowTarget {

	/**
	 * New window.
	 */
	public static final String BLANK = "_blank";
	/**
	 * Current window.
	 */
	public static final String SELF = "_self";
	/**
	 * Parent window.
	 */
	public static final String PARENT = "_parent";
	/**
	 * Top window.
	 */
	public static final String TOP = "_top";

	/**
	 * Private constructor.
	 */
	private WindowTarget() {
		// Do nothing
	}

}
