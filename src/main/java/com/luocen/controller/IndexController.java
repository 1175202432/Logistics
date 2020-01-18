package com.luocen.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Luocen
 * @since 2020-01-08
 */
@Controller
public class IndexController {

	@RequestMapping("/system")
	public String system() {
		return "/system";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "/user";
	}

	@RequestMapping("/userAdd")
	public String userAdd() {
		return "/userAdd";
	}

	@RequestMapping("/orders")
	public String orders() {
		return "/orders";
	}

	@RequestMapping("/route")
	public String route() {
		return "/route";
	}
	
	@RequestMapping("/truck")
	public String truck() {
		return "/truck";
	}
}

