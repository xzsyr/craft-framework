package com.xzsyr.admin.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
@Component
public class TokenAuthorFilte extends ZuulFilter {
	Logger logger= LoggerFactory.getLogger(getClass());
	
	@Override
	public Object run() {
		 RequestContext ctx= RequestContext.getCurrentContext();
	     HttpServletRequest req=ctx.getRequest();
	     logger.info(String.format("%s >>> %s", req.getMethod(), req.getRequestURL().toString()));
	     String accessToken = req.getHeader("token");//header方式
	     logger.info(accessToken+"########");
	     if (StringUtils.isEmpty(accessToken)&&!(req.getRequestURL().toString().indexOf("/login")!=-1)) {
	    	logger.warn("-------------token is empty-------------");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}
            return null;
         }
	    logger.info("-------------ok---------------------");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return false;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		  return "pre";
	}

}
