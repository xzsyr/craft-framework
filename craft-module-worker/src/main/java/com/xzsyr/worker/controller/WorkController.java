   
 /**     
 * @discription 在此输入一句话描述此文件的作用
 * @author jizhuang.wang       
 * @created 2018年4月28日 下午1:50:08    
 * tags     
 * see_to_target     
 */

package com.xzsyr.worker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**        
 * Title: WorkController.java    
 * Description: 描述
 * @author jizhuang.wang       
 * @created 2018年4月28日 下午1:50:08    
 */
@RestController
public class WorkController {
	
	@Value("${server.port}")
    String port;
    
	  
	/**     
	 * @discription 获取工匠名称
	 * @author jizhuang.wang       
	 * @created 2018年4月28日 下午1:51:37     
	 * @param name
	 * @return     
	 */
	@RequestMapping(value="/getName/{name}",method=RequestMethod.GET)
    public String getName(@PathVariable("name") String name) {
        return "hi "+name+",i am worker:" +port;
    }
}
