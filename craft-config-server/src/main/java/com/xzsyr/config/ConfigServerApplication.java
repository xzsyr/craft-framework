package com.xzsyr.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

  
/**         
 * Title: ConfigServerApplication.java    
 * Description: 在分布式系统中，由于服务数量巨多，为了方便服务配置文件统一管理，实时更新，所以需要分布式配置中心组件；
 * 它支持配置服务放在配置服务的内存中（即本地），也支持放在远程Git仓库中。
 * 在spring cloud config 组件中，分两个角色，一是config server，二是config client。
 * @author jizhuang.wang       
 * @created 2018年4月24日 下午4:16:03    
 */      
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerApplication 
{
	public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
