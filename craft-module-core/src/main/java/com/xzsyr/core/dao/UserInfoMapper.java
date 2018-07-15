package com.xzsyr.core.dao;

import com.xzsyr.core.entity.UserInfo;

public interface UserInfoMapper {

	UserInfo findByUsername(String userName);
  
}
