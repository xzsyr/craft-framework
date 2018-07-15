package com.xzsyr.employ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

  
/**        
 * Title: EmployServerApplication.java    
 * Description: 雇主微服务启动入口
 * @author jizhuang.wang       
 * @created 2018年4月24日 下午1:27:15    
 */      
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@RefreshScope 
public class EmployServerApplication {
	public static void main(String[] args) {
        SpringApplication.run(EmployServerApplication.class, args);
    }
}
