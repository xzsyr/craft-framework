   
 /**     
 * @discription 在此输入一句话描述此文件的作用
 * @author jizhuang.wang       
 * @created 2018年4月28日 下午1:57:39    
 * tags     
 * see_to_target     
 */

package com.xzsyr.employ.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.github.pagehelper.PageInfo;
import com.xzsyr.employ.dto.EmployDTO;
import com.xzsyr.employ.entity.EmployInfo;

/**        
 * Title: EmployService.java    
 * Description: 描述
 * @author jizhuang.wang       
 * @created 2018年4月28日 下午1:57:39    
 */

public interface EmployService {


	PageInfo<EmployInfo> pages(@RequestBody EmployDTO empDto, int pageNum, int pageSize);

}
