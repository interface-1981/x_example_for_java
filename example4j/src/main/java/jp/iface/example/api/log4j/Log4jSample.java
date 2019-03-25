package jp.iface.example.api.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// ロガーを生成
		Logger logger = LogManager.getLogger();

		// TRACE Level
		logger.trace("test trace");

		// DEBUG Level
		logger.debug("test debug");

		// INFO Level
		logger.info("test info");

		// WARN Level
		logger.warn("test warn");

		// ERROR Level
		logger.error("test error");

		// FATAL Level
		logger.fatal("test fatal");

	}

}
