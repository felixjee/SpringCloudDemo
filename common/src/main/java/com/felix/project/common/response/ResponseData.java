package com.felix.project.common.response;

import java.io.Serializable;

/**
 * @author Felxi
 * @date 2019-02-20
 */
public class ResponseData<T> implements Serializable {
	private int code;
	private String msg;
	private T data;
	
	
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
	
	
	public static ResponseData success(Object data) {
		ResponseData resp = new ResponseData();
		resp.data = data;
		return resp;
	}
	
	@Override
	public String toString() {
		return "ResponseData{" +
				       "code=" + code +
				       ", msg='" + msg + '\'' +
				       ", data=" + data +
				       '}';
	}
}
