package com.luocen.controller;


import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luocen.entity.Route;
import com.luocen.service.IRouteService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Luocen
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/route")
public class RouteController {

	@Autowired
	private IRouteService routeService;

	@RequestMapping("/queryById")
	public Route queryById(String id) {
		return routeService.getById(id);
	}

	@RequestMapping("/queryByPage")
	@ResponseBody
	public Map<String,Object> queryByPage(@RequestParam(name="page ",defaultValue="0")int page,@RequestParam(name="limit",defaultValue="20")int limit) {
		System.out.println("接收到请求：queryByPage");
		PageHelper.startPage(page,limit);
		List<Route> list = routeService.list();
		PageInfo<Route> info = new PageInfo<>(list);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "ms");
		map.put("count", info.getTotal());
		map.put("data", info.getList());
		return map;
	}

	@RequestMapping("/add")
	public boolean queryById(Route route) {
		System.out.println("接收到请求：add "+ route);
		boolean flue = routeService.save(route);
		routeService.update();
		return flue;
	}

	@RequestMapping("/update")
	public boolean update(Route route) {
		System.out.println("接收到请求：update "+ route);
		return routeService.saveOrUpdate(route);
	}
	
	@RequestMapping("/deleteById")
	@ResponseBody
	public boolean deleteById(String id) {
		System.out.println("接收到请求：deleteById "+ id);
		routeService.removeById(id);
		return true;
	}

	@RequestMapping("/deleteMore")
	@ResponseBody
	public boolean deleteMore(@RequestParam(name="idList")Collection idList) {
		System.out.println("接收到请求：deleteByMore");
		routeService.removeByIds(idList);
		return true;
	}
	
}

