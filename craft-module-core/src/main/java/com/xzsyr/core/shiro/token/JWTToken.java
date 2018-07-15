package com.xzsyr.core.shiro.token;

import org.apache.shiro.authc.AuthenticationToken;

public class JWTToken implements AuthenticationToken{

	
	/**  描述   (@author: jizhuang.wang) */      
	
	private static final long serialVersionUID = 5166504592020532791L;
	// 密钥
    private String token;

    public JWTToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }

}
