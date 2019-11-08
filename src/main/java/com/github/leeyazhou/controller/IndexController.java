/**
 * 
 */
package com.github.leeyazhou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leeyazhou
 *
 */
@RestController
public class IndexController {

	@RequestMapping(value = { "index", "index.html", "index.htm", "/" })
	public String index() {
		return "index";
	}
}
