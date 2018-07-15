   
 /**     
 * @discription 在此输入一句话描述此文件的作用
 * @author jizhuang.wang       
 * @created 2018年4月28日 下午1:45:34    
 * tags     
 * see_to_target     
 */

package com.xzsyr.employ.fallback;

import org.springframework.stereotype.Component;

import com.xzsyr.employ.provider.WorkServiceProvider;

/**        
 * Title: WorkServiceHiHystric.java    
 * Description: 描述
 * @author jizhuang.wang       
 * @created 2018年4月28日 下午1:45:34    
 */
@Component
public class WorkServiceHystric implements WorkServiceProvider {
	  
	/** 
	 * @discription 在此输入一句话描述作用
	 * @author jizhuang.wang       
	 * @created 2018年4月28日 下午1:48:37      
	 * @param name
	 * @return     
	 * @see com.xzsyr.employ.clientinterface.WorkServiceClient#getWorkerNameById(String)
	 */  
	
	@Override
	public String getWorkerNameById(String name) {
		return "sorry "+name;
	}
}
