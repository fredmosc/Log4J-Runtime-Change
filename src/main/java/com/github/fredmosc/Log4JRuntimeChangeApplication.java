package com.github.fredmosc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4JRuntimeChangeApplication implements ApplicationRunner {

    Logger logger = LoggerFactory.getLogger(Log4JRuntimeChangeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Log4JRuntimeChangeApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        do {
            logger.trace("A TRACE Message");
            logger.debug("A DEBUG Message");
            logger.info("An INFO Message");
            logger.warn("A WARN Message");
            logger.error("An ERROR Message");
            Thread.sleep(1000);
        } while (true);
    }
}
