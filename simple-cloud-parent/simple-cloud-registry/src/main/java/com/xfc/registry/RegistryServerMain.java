package com.xfc.registry;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistryServerMain 
{
	public static void main(String[] args) {
		new SpringApplicationBuilder(RegistryServerMain.class).web(true).run(args);
	}
}
