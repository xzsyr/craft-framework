/**  
* @Title: EmployServiceProvider.java  
* @Package com.xzsyr.admin.provider  
* @Description: TODO 
* @author jizhuang.wang 
* @date 2018年7月8日  
* @version V1.0  
*/ 
package com.xzsyr.admin.provider;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xzsyr.admin.fallback.EmployServiceFallBack;
import com.xzsyr.common.ResponseBean;

/**  
* @ClassName: EmployServiceProvider  
* @Description: TODO 
* @author jizhuang.wang  
* @date 2018年7月8日  
*    
*/
@FeignClient(value = "craft-employ-server",fallback = EmployServiceFallBack.class)
public interface EmployServiceProvider {
	
	 /**  
	* @Title: getEmpInfoByName  
	* @Description: TODO  根据名称获取雇主信息
	* @param @param name  名称
	* @param @return    参数  
	* @return String    返回类型  
	* @throws                
	*/  
	@RequestMapping(value = "/getEmpInfoByName/{name}",method = RequestMethod.GET)
  	public ResponseBean getEmpInfoByName(@PathVariable("name") String name);
}
