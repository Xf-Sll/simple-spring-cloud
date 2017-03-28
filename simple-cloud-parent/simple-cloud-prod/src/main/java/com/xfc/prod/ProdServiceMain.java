package com.xfc.prod;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProdServiceMain 
{
    public static void main( String[] args )
    {
    	new SpringApplicationBuilder(ProdServiceMain.class).web(true).run(args);
    }
}
