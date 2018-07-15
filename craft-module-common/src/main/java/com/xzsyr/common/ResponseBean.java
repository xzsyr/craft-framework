package com.xzsyr.common;

import java.io.Serializable;

public class ResponseBean<T> implements Serializable{
	/**  
	* @Fields field:field:{todo}
	*/
	private static final long serialVersionUID = 986889085627113130L;

	// http 状态码
    private int code;

    // 返回信息
    private String msg;

    // 返回的数据
    private T data;

    public ResponseBean(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

	/**  
	* 创建一个新的实例 ResponseBean.  
	*    
	*/ 
	public ResponseBean() {
		super();
	}

}
