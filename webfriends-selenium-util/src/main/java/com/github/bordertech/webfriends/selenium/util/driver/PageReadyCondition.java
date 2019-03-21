package com.github.bordertech.webfriends.selenium.util.driver;

import java.util.function.Function;
import org.openqa.selenium.WebDriver;

/**
 * Page ready condition.
 */
public interface PageReadyCondition extends Function<WebDriver, Boolean> {

}
