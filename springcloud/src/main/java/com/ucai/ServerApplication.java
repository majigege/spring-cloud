package com.ucai;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka服务注册中心
 * @author my
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		new SpringApplicationBuilder(ServerApplication.class).web(true).run(args);
	}
}
