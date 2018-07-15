/**  
* @Title: SearchProvider.java  
* @Package com.xzsyr.admin.provider  
* @Description: TODO 
* @author jizhuang.wang 
* @date 2018年7月8日  
* @version V1.0  
*/ 
package com.xzsyr.admin.provider;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.xzsyr.admin.fallback.SearchServiceFallBack;

/**  
* @ClassName: SearchProvider  
* @Description: TODO 
* @author jizhuang.wang  
* @date 2018年7月8日  
*    
*/
@FeignClient(value = "craft-serarch-server",fallback = SearchServiceFallBack.class)
public interface SearchServiceProvider {

}
