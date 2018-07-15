package com.xzsyr.admin.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xzsyr.common.ResponseBean;
import com.xzsyr.core.entity.UserInfo;
import com.xzsyr.core.service.UserInfoService;
import com.xzsyr.core.utils.JWTUtil;

  
/**        
 * Title: AdminController.java    
 * Description: 描述
 * @author jizhuang.wang       
 * @created 2018年6月14日 上午10:10:41    
 */      
@SuppressWarnings("all")
@RestController
public class AdminController {
	
	@Autowired
    private UserInfoService userService;
    
	  
	/**     
	 * @discription 登入
	 * @author jizhuang.wang       
	 * @created 2018年6月14日 上午10:09:49     
	 * @param username
	 * @param password
	 * @return     
	 */
	@RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    @ResponseBody
    public ResponseBean login(
    		@RequestParam("username") String username,
    		@RequestParam("password") String password) {
		UserInfo userBean = userService.findByUsername(username);
		System.out.println(userBean.getUid());
        if (userBean.getPassword().equals(password)) {
            return new ResponseBean(200, "Login success", JWTUtil.sign(username, password));
        } else {
            throw new UnauthorizedException();
        }
    }
	
	  
	/**     
	 * @discription 登出
	 * @author jizhuang.wang       
	 * @created 2018年6月14日 上午10:10:06     
	 * @return     
	 */
	@RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    @ResponseBody
	public ResponseBean logout(){
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return new ResponseBean(200, "Login success", "logout ok");
	}
}
