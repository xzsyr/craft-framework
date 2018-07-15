/**  
* @Title: UserInfoServiceImpl.java  
* @Package com.xzsyr.core.service.impl  
* @Description: TODO 
* @author jizhuang.wang 
* @date 2018年6月10日  
* @version V1.0  
*/ 
package com.xzsyr.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xzsyr.core.dao.UserInfoMapper;
import com.xzsyr.core.entity.UserInfo;
import com.xzsyr.core.service.UserInfoService;

/**  
* @ClassName: UserInfoServiceImpl  
* @Description: TODO 
* @author jizhuang.wang  
* @date 2018年6月10日  
*    
*/
@Service
public class UserInfoServiceImpl implements UserInfoService{
	@Autowired
	private UserInfoMapper userMapper;
	 
     
	@Override
	public UserInfo findByUsername(String userName) {
		return userMapper.findByUsername(userName);
	}

}
