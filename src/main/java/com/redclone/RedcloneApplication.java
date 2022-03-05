package com.redclone;

import com.redclone.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class RedcloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedcloneApplication.class, args);
	}

}
