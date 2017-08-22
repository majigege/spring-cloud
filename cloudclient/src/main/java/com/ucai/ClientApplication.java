package com.ucai;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ���������ṩ��
 * @author my
 *
 *����@EnableDiscoveryClientע����ܼ���Eureka�е�
 *DiscoveryClientʵ�֣�����ʵ��Controller�жԷ�����Ϣ�������
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ClientApplication.class, args);
		new SpringApplicationBuilder(ClientApplication.class).web(true).run(args);
	}
}
