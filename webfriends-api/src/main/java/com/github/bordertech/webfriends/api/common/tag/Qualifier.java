package com.github.bordertech.webfriends.api.common.tag;

/**
 * Element attribute qualifier condition.
 */
public class Qualifier {

	public static Qualifier create(final String key) {
		return new Qualifier(key);
	}

	public static Qualifier create(final String key, final String value) {
		return new Qualifier(key, value);
	}

	public static Qualifier create(String key, String value, Predicate predicate) {
		return new Qualifier(key, value, predicate);
	}

	public enum Predicate {
		EQUALS,
		CONTAINS,
		HAS
	}

	private final String key;
	private final String value;
	private final Predicate predicate;

	public Qualifier(final String key) {
		this(key, null, Predicate.HAS);
	}

	public Qualifier(final String key, final String value) {
		this(key, value, Predicate.EQUALS);
	}

	public Qualifier(String key, String value, Predicate predicate) {
		this.key = key;
		this.value = value;
		this.predicate = predicate;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public Predicate getPredicate() {
		return predicate;
	}

}
