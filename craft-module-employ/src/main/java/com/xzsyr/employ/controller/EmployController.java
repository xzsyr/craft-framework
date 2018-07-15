   
 /**     
 * @discription 雇主信息管理
 * @author jizhuang.wang       
 * @created 2018年4月28日 上午11:31:06    
 * tags     
 * see_to_target     
 */

package com.xzsyr.employ.controller;

import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.xzsyr.common.ResponseBean;
import com.xzsyr.employ.dto.EmployDTO;
import com.xzsyr.employ.entity.EmployInfo;
import com.xzsyr.employ.provider.WorkServiceProvider;
import com.xzsyr.employ.service.EmployService;


/**        
 * Title: EmployController.java    
 * Description: 雇主控制层
 * @author jizhuang.wang       
 * @created 2018年4月28日 上午11:31:06    
 */
@SuppressWarnings("all")
@RestController
public class EmployController {
	
	private static Logger log = LoggerFactory.getLogger(EmployController.class); 
	@Value("${server.port}")
    String port;
	@Autowired
    private EmployService employService;
	@Autowired
	private WorkServiceProvider workServiceProvider;
	
	  
	/**     
	 * @discription 雇主列表
	 * @author jizhuang.wang       
	 * @created 2018年6月13日 下午4:46:41     
	 * @param empDto
	 * @param pageNum
	 * @param pageSize
	 * @return     
	 */
	@RequestMapping(value="/empList",method={RequestMethod.POST, RequestMethod.GET})
	public PageInfo<EmployInfo> list(@RequestBody EmployDTO empDto, @RequestParam(value="pageNum") int pageNum, 
            @RequestParam(value="pageSize") int pageSize){
		PageInfo<EmployInfo> emps = employService.pages(empDto,pageNum, pageSize);
		return emps;
	}
	/**     
	 * @discription 雇主注册
	 * @author jizhuang.wang       
	 * @created 2018年6月13日 下午4:01:23     
	 * @return     
	 */
	@RequestMapping(value="/empReg",method=RequestMethod.POST)
	public ResponseBean register(@RequestBody EmployDTO empDto){
		log.info("-------emp:register---------");
		return new ResponseBean(HttpStatus.OK.value(), "注册成功！", "注册成功！");
	}
	
	  
	/**     
	 * @discription 编辑
	 * @author jizhuang.wang       
	 * @created 2018年6月13日 下午4:21:24     
	 * @return     
	 */
	@RequestMapping(value="/empEdit",method=RequestMethod.POST)
	public ResponseBean edit(@RequestBody EmployDTO empDto){
		log.info("-------emp:register---------");
		return new ResponseBean(HttpStatus.OK.value(), "注册成功！", null);
	}
	/**     
	 * @discription 删除
	 * @author jizhuang.wang       
	 * @created 2018年6月13日 下午4:21:24     
	 * @return     
	 */
	@RequestMapping(value="/empRemove/{empid}",method=RequestMethod.POST)
	public ResponseBean remove(@PathVariable("empid") String empid){
		log.info("-------emp:register---------");
		return new ResponseBean(HttpStatus.OK.value(), "注册成功！", null);
	}
	/**     
	 * @discription 根据emp名称,加载明细信息
	 * @author jizhuang.wang       
	 * @created 2018年4月28日 下午1:51:37     
	 * @param empNm 雇主名称
	 * @return     
	 */
	@RequestMapping(value="/getEmpInfoByName/{empNm}",method=RequestMethod.GET)
    public ResponseBean getEmpInfoByName(@PathVariable("empNm") String empNm) {
		log.info("-------emp:getEmpInfoByName---------");
		return new ResponseBean(HttpStatus.OK.value(), "okkkkkkk成功！", "####");
    }
	
	/**     
	 * @discription 获取工匠名称@PathVariable("empid") String empid
	 * @author jizhuang.wang       
	 * @created 2018年4月28日 下午1:51:37     
	 * @param name
	 * @return     
	 */
	@RequestMapping(value="/getWorksByEmpId/{empid}",method=RequestMethod.GET)
    public String getWorkName(@PathVariable("empid") String empid) {
		log.info("-------emp:register---------");
        return workServiceProvider.getWorkerNameById(empid);
    }
}
