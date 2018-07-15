package com.xzsyr.employ.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.xzsyr.common.ResponseBean;
import com.xzsyr.employ.dto.ArticleDTO;
import com.xzsyr.employ.dto.EmployDTO;
import com.xzsyr.employ.entity.ArticleInfo;
import com.xzsyr.employ.entity.EmployInfo;
import com.xzsyr.employ.service.ArticleService;
import com.xzsyr.employ.service.EmployService;

  
/**        
 * Title: ArticleController.java    
 * Description: 描述
 * @author jizhuang.wang       
 * @created 2018年6月13日 下午4:53:37    
 */      
@SuppressWarnings("all")
@RestController
@RequestMapping(value="/article")
public class ArticleController {
	private static Logger log = LoggerFactory.getLogger(EmployController.class); 
	/*@Autowired
    private ArticleService articleService;
	
	public ResponseBean<ArticleInfo> list(@RequestBody ArticleDTO articleDto, @RequestParam(value="pageNum") int pageNum, 
            @RequestParam(value="pageSize") int pageSize){
		ResponseBean<ArticleInfo> articles = articleService.pages(articleDto,pageNum, pageSize);
		return articles;
	}*/
}
