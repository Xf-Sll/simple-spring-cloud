package com.xfc.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerMain {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigServerMain.class).web(true).run(args);
	}
}
