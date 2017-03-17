package com.xfc.gateway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.xfc.gateway.filter.TokenAccessFilter;

@EnableZuulProxy
@SpringCloudApplication
public class GatewayMain 
{
    public static void main( String[] args )
    {
    	new SpringApplicationBuilder(GatewayMain.class).web(true).run(args);
    }
    
    @Bean
	public TokenAccessFilter accessFilter() {
		return new TokenAccessFilter();
	}
    
}
