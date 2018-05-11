package org.lili.spring.cloud.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/********************************** 
 * @company 智慧互通科技有限公司
 * @author  wenli.zhao
 * @date    2018年4月25日
 * @desc
 ****************************/
@EnableDiscoveryClient/** 自动化配置 **/
@SpringBootApplication
public class EurekaClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
