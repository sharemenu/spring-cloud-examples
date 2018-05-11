package org.lili.spring.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/********************************** 
 * @company 智慧互通科技有限公司
 * @author  wenli.zhao
 * @date    2018年4月25日
 * @desc
 ****************************/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerSingleton {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerSingleton.class, args);
	}
}
