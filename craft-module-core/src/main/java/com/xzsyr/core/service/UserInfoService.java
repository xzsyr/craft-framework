/**  
* @Title: UserService.java  
* @Package com.xzsyr.core.service  
* @Description: TODO 
* @author jizhuang.wang 
* @date 2018年6月10日  
* @version V1.0  
*/ 
package com.xzsyr.core.service;


import com.xzsyr.core.entity.UserInfo;

/**  
* @ClassName: UserService  
* @Description: TODO 
* @author jizhuang.wang  
* @date 2018年6月10日  
*    
*/
public interface UserInfoService {

	/**  
	* @Title: findByUsername  
	* @Description: TODO  
	* @param @param userName
	* @param @return    参数  
	* @return UserInfo    返回类型  
	* @throws  
	*/  
	UserInfo findByUsername(String userName);

}
