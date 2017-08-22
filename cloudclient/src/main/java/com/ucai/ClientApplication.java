package com.ucai;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 创建服务提供方
 * @author my
 *
 *加上@EnableDiscoveryClient注解才能激活Eureka中的
 *DiscoveryClient实现，才能实现Controller中对服务信息的输出。
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ClientApplication.class, args);
		new SpringApplicationBuilder(ClientApplication.class).web(true).run(args);
	}
}
