package com.xzsyr.employ.service;

import com.xzsyr.common.ResponseBean;
import com.xzsyr.employ.dto.ArticleDTO;
import com.xzsyr.employ.entity.ArticleInfo;

public interface ArticleService {

	ResponseBean<ArticleInfo> pages(ArticleDTO articleDto, int pageNum, int pageSize);

}
