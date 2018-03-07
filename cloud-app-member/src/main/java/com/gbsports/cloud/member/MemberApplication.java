package com.gbsports.cloud.member;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MemberApplication 
{
    public static void main( String[] args )
    {
    	// SpringApplication.run(DiscoveryApplication.class, args);
        new SpringApplicationBuilder(MemberApplication.class).web(true).run(args);
    }
}
