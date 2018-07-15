package com.xzsyr.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
 
  
/**        
 * Title: EurekaServerApplication.java    
 * Description: 服务注册中心
 * @author jizhuang.wang       
 * @created 2018年4月24日 下午12:51:14    
 */      
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication 
{
	public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
