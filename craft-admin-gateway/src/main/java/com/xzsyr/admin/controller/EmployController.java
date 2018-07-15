/**  
* @Title: EmployController.java  
* @Package com.xzsyr.admin.controller  
* @Description: TODO 
* @author jizhuang.wang 
* @date 2018年7月8日  
* @version V1.0  
*/ 
package com.xzsyr.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xzsyr.admin.provider.EmployServiceProvider;
import com.xzsyr.common.ResponseBean;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

/**  
* @ClassName: EmployController  
* @Description: TODO 雇主信息管理
* @author jizhuang.wang  
* @date 2018年7月8日  
*    
*/
@SuppressWarnings("all")
@RestController
@RequestMapping(value="/emp")
public class EmployController {
  
	private static Logger log = LoggerFactory.getLogger(EmployController.class); 
	@Autowired
	private EmployServiceProvider employProvicer;
	
	/**  
	* @Title: getEmpInfoByName  
	* @Description: TODO  根据名称获取雇主信息
	* @param @return    参数  
	* @return ResponseBean    返回类型  
	* @throws  
	*/  
	@RequestMapping(value="/getEmpInfoByName/{name}",method=RequestMethod.GET)
	public ResponseBean getEmpInfoByName(@PathVariable("name") String name) {
		log.info("-------emp:register---------");
		return  employProvicer.getEmpInfoByName(name);
	}
	
	@ApiOperation(value = "测试post请求",notes="注意事项")
	@ApiImplicitParam(dataType = "User",name = "user",value = "用户信息",required = true)
	@RequestMapping(value = "/testPost",method = RequestMethod.POST)
	public String testPost(@RequestBody Error user){
		return "success";
	}


	@ApiOperation(value = "测试get请求",notes="注意事项")
	@ApiImplicitParam(name = "id",value = "用户id",dataType = "String",paramType = "path")
	@RequestMapping(value = "/testGet/{id}",method = RequestMethod.GET)
	public String testGet(@PathVariable String id){
		return id;
	}

	@ApiOperation(value = "测试组合注解",notes="注意事项")
	@ApiImplicitParams({
			@ApiImplicitParam(dataType = "User",name = "user",value = "用户信息",required = true,paramType = "body"),
			@ApiImplicitParam(dataType = "string",name = "id",value = "用户id",required = true,paramType = "path")
	})
	@RequestMapping(value = "/joinAnnotation/{id}",method = RequestMethod.POST)
	public Error joinAnnotation(@PathVariable String id,@RequestBody Error user){
		return user;
	}
	
	@ApiIgnore
	public String testIgnore(){
		return "success";
	}
}
