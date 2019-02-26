package com.felix.project.common.exception;

/**
 * @author Felxi
 * @date 2019-02-20
 */
public class CommonException extends RuntimeException {
	private ErrorCode errorCode;
	
	public CommonException(ErrorCode errorCode) {
		super(errorCode.getMsg());
		this.errorCode = errorCode;
	}
	
	public CommonException(ErrorCode errorCode, String msg) {
		super(msg);
		this.errorCode = errorCode;
	}
	
	public ErrorCode getErrorCode() {
		return errorCode;
	}
	
	
	public int getCode() {
		return errorCode.getCode();
	}
	
	public String getMsg() {
		return errorCode.getMsg();
	}
}
