/**  
* @Title: WorkerServiceProvider.java  
* @Package com.xzsyr.admin.provider  
* @Description: TODO 
* @author jizhuang.wang 
* @date 2018年7月8日  
* @version V1.0  
*/ 
package com.xzsyr.admin.provider;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.xzsyr.admin.fallback.WorkerServiceFallBack;

/**  
* @ClassName: WorkerServiceProvider  
* @Description: TODO 
* @author jizhuang.wang  
* @date 2018年7月8日  
*    
*/
@FeignClient(value = "craft-work-server",fallback = WorkerServiceFallBack.class)
public interface WorkerServiceProvider {

}
