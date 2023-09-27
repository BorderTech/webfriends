package com.github.bordertech.webfriends.junit.server;

/**
 * Local server launcher.
 */
public interface ServerProvider {

	/**
	 * Start the server.
	 */
	void startServer();

	/**
	 * Stop the server.
	 */
	void stopServer();

	/**
	 * Start the server for a suite of tests.
	 */
	void startSuite();

	/**
	 * Stop the server for a suite of tests.
	 */
	void stopSuite();

	/**
	 * Restart the server.
	 */
	void restartServer();

	/**
	 * @return true if server is running
	 */
	boolean isRunning();

	/**
	 * @return true if processing a suite of tests
	 */
	boolean inSuite();

	/**
	 * @return the base URL for the server
	 */
	String getBaseUrl();

}
