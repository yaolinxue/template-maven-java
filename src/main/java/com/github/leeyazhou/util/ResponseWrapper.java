/**
 * 
 */
package com.github.leeyazhou.util;

/**
 * @author leeyazhou
 *
 */
public class ResponseWrapper<T> {

	private int code;
	private T data;
	private String message = "success";

	public ResponseWrapper() {
	}

	public ResponseWrapper(T data) {
		this.data = data;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
