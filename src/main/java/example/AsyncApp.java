package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AsyncApp {

	private static final Logger logger = LoggerFactory.getLogger(AsyncApp.class);

	public static void main(String[] args) {

		// (1) PUT MQ
		putMq();

		// (2) GET MQ
		Runnable getNotifyResponse = new Runnable() {
			public void run() {
				logger.info("(2) GET...");
				logger.info("START LONG RUNNING PROCESS");
				getMq();
				logger.info("END LONG RUNNING PROCESS");
			}
		};

		Thread backgroundProcess = new Thread(getNotifyResponse, "GetNotify-Thread");
		backgroundProcess.start();

		// (3) NEXT STEP
		logger.info("(3) NEXT STEP");
	}

	private static void putMq() {
		logger.info("(1) PUT...");
	}

	private static long getMq() {

		long result = 0;

		try {
			Thread.sleep(5000L);
			result = System.currentTimeMillis();
			logger.info("Long time no see");
		} catch (InterruptedException e) {
			logger.error("ERROR: {}", e.getMessage());
			e.printStackTrace();
		}

		return result;
	}
}
