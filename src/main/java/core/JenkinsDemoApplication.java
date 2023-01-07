package core;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static Logger LOGGER = LoggerFactory.getLogger(JenkinsDemoApplication.class);

	@PostConstruct
	public void init(){
		LOGGER.info("Application started ...");
	}

	public static void main(String[] args) {
		LOGGER.info("Application executed ...");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
