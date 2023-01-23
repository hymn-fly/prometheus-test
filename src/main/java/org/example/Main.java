package org.example;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws IOException, InterruptedException {
		int count = 0;

		while (true) {
			Thread.sleep(5L * 1000L);
			count += 5;

			logger.debug("test {}", count);
		}
	}
}