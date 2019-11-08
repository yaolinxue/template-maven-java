/**
 * 
 */
package com.github.leeyazhou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.leeyazhou.util.R;
import com.github.leeyazhou.util.ResponseWrapper;

/**
 * @author leeyazhou
 *
 */
@RestController
public class IndexController {

	@RequestMapping(value = { "index", "index.html", "index.htm", "/" })
	public ResponseWrapper<String> index() {
		return R.success();
	}
}
