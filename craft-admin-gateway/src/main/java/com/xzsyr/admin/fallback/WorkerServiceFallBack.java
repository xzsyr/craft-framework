/**  
* @Title: WorkerServiceFallBack.java  
* @Package com.xzsyr.admin.fallback  
* @Description: TODO 
* @author jizhuang.wang 
* @date 2018年7月8日  
* @version V1.0  
*/ 
package com.xzsyr.admin.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

/**  
* @ClassName: WorkerServiceFallBack  
* @Description: TODO 
* @author jizhuang.wang  
* @date 2018年7月8日  
*    
*/
@Component
public class WorkerServiceFallBack implements FallbackProvider{

	/* (非 Javadoc)  
	* <p>Title: fallbackResponse</p>  
	* <p>Description: </p>  
	* @return  
	* @see org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider#fallbackResponse()  
	*/  
	@Override
	public ClientHttpResponse fallbackResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (非 Javadoc)  
	* <p>Title: getRoute</p>  
	* <p>Description: </p>  
	* @return  
	* @see org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider#getRoute()  
	*/  
	@Override
	public String getRoute() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (非 Javadoc)  
	* <p>Title: fallbackResponse</p>  
	* <p>Description: </p>  
	* @param cause
	* @return  
	* @see org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider#fallbackResponse(java.lang.Throwable)  
	*/  
	@Override
	public ClientHttpResponse fallbackResponse(Throwable cause) {
		// TODO Auto-generated method stub
		return null;
	}

}
