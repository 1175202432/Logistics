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
import com.luocen.entity.Orders;
import com.luocen.service.IOrdersService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Luocen
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private IOrdersService ordersService;

	@RequestMapping("/queryById")
	public Orders queryById(String id) {
		return ordersService.getById(id);
	}

	@RequestMapping("/queryByPage")
	@ResponseBody
	public Map<String,Object> queryByPage(@RequestParam(name="page ",defaultValue="0")int page,@RequestParam(name="limit",defaultValue="20")int limit) {
		System.out.println("接收到请求：queryByPage");
		PageHelper.startPage(page,limit);
		List<Orders> list = ordersService.list();
		PageInfo<Orders> info = new PageInfo<>(list);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "ms");
		map.put("count", info.getTotal());
		map.put("data", info.getList());
		return map;
	}

	@RequestMapping("/add")
	public boolean queryById(Orders orders) {
		System.out.println("接收到请求：add "+ orders);
		boolean flue = ordersService.save(orders);
		ordersService.update();
		return flue;
	}

	@RequestMapping("/update")
	public boolean update(Orders orders) {
		System.out.println("接收到请求：update "+ orders);
		return ordersService.saveOrUpdate(orders);
	}
	
	@RequestMapping("/deleteById")
	@ResponseBody
	public boolean deleteById(String id) {
		System.out.println("接收到请求：deleteById "+ id);
		ordersService.removeById(id);
		return true;
	}

	@RequestMapping("/deleteMore")
	@ResponseBody
	public boolean deleteMore(@RequestParam(name="idList")Collection idList) {
		System.out.println("接收到请求：deleteByMore");
		ordersService.removeByIds(idList);
		return true;
	}
	
}

