   
 /**     
 * @discription 在此输入一句话描述此文件的作用
 * @author jizhuang.wang       
 * @created 2018年4月28日 下午1:58:12    
 * tags     
 * see_to_target     
 */

package com.xzsyr.employ.service.impl;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.xzsyr.employ.dto.EmployDTO;
import com.xzsyr.employ.entity.EmployInfo;
import com.xzsyr.employ.service.EmployService;

/**        
 * Title: EmployServiceImpl.java    
 * Description: 描述
 * @author jizhuang.wang       
 * @created 2018年4月28日 下午1:58:12    
 */
@Service
public class EmployServiceImpl implements EmployService{

	@Override
	public PageInfo<EmployInfo> pages(EmployDTO empDto, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
