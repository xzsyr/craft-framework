   
 /**     
 * @discription 在此输入一句话描述此文件的作用
 * @author jizhuang.wang       
 * @created 2018年4月28日 下午1:42:51    
 * tags     
 * see_to_target     
 */

package com.xzsyr.employ.provider;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xzsyr.employ.fallback.WorkServiceHystric;



/**        
 * Title: WorkClient.java    
 * Description: 工匠微服务调用
 * @author jizhuang.wang
 * @created 2018年4月28日 下午1:42:51
 */
@FeignClient(value = "craft-work-server",fallback = WorkServiceHystric.class)
public interface WorkServiceProvider {
       
     @RequestMapping(value = "/getName/{name}",method = RequestMethod.GET)
  	 public String getWorkerNameById(@PathVariable("name") String name);
}
