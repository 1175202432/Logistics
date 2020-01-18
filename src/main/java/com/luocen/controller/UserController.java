package com.luocen.controller;


import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.ResponseWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luocen.entity.User;
import com.luocen.service.IUserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Luocen
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;

	@RequestMapping("/queryById")
	public User queryById(String id) {
		return userService.getById(id);
	}

	@RequestMapping("/queryByPage")
	@ResponseBody
	public Map<String,Object> queryByPage(@RequestParam(name="page ",defaultValue="0")int page,@RequestParam(name="limit",defaultValue="20")int limit) {
		System.out.println("接收到请求：queryByPage");
		PageHelper.startPage(page,limit);
		List<User> list = userService.list();
		PageInfo<User> info = new PageInfo<>(list);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "ms");
		map.put("count", info.getTotal());
		map.put("data", info.getList());
		return map;
	}

	@RequestMapping("/add")
	public boolean queryById(User user) {
		System.out.println("接收到请求：add "+ user);
		boolean flue = userService.save(user);
		userService.update();
		return flue;
	}

	@RequestMapping("/update")
	public boolean update(User user) {
		System.out.println("接收到请求：update "+ user);
		return userService.saveOrUpdate(user);
	}
	
	@RequestMapping("/deleteById")
	@ResponseBody
	public boolean deleteById(String id) {
		System.out.println("接收到请求：deleteById "+ id);
		userService.removeById(id);
		return true;
	}

	@RequestMapping("/deleteMore")
	@ResponseBody
	public boolean deleteMore(@RequestParam(name="idList")Collection idList) {
		System.out.println("接收到请求：deleteByMore");
		userService.removeByIds(idList);
		return true;
	}
	
}

