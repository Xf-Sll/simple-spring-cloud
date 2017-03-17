package com.xfc.user;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserServiceMain 
{
    public static void main( String[] args )
    {
    	new SpringApplicationBuilder(UserServiceMain.class).web(true).run(args);
    }
}
