package com.xzsyr.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;


/**        
 * Title: SleuthServerApplication.java    
 * Description: 服务链路追踪（分析）
 * @author jizhuang.wang       
 * @created 2018年4月26日 下午1:00:18    
 */      
@SpringBootApplication
@EnableZipkinServer
public class SleuthServerApplication 
{
	public static void main(String[] args) {
        SpringApplication.run(SleuthServerApplication.class, args);
    }
}
