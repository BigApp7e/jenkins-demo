package core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

	public static Logger LOGGER = LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);

	@Test
	void contextLoads() {
		LOGGER.info("Execute test ...");
		LOGGER.info("Execute test one more time...");
		Assertions.assertEquals(true, true);
	}

}
