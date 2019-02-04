package com.github.bordertech.webfriends.selenium.idiom.messages;

import com.github.bordertech.webfriends.api.idiom.messages.Messages;

/**
 * Selenium element with all message types.
 */
public interface MessagesSelenium extends Messages, MessagesErrorSelenium, MessagesInfoSelenium, MessagesSuccessSelenium, MessagesValidationSelenium, MessagesWarnSelenium {

}
