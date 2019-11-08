/**
 * 
 */
package com.github.leeyazhou.util;

/**
 * result
 * 
 * @author leeyazhou
 *
 */
public class R {

	public static <T> ResponseWrapper<T> success() {
		return new ResponseWrapper<T>();
	}


	public static <T> ResponseWrapper<T> success(T data) {
		return new ResponseWrapper<T>(data);
	}
}
