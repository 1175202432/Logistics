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
import com.luocen.entity.Truck;
import com.luocen.service.ITruckService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Luocen
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/truck")
public class TruckController {

	@Autowired
	private ITruckService truckService;

	@RequestMapping("/queryById")
	public Truck queryById(String id) {
		return truckService.getById(id);
	}

	@RequestMapping("/queryByPage")
	@ResponseBody
	public Map<String,Object> queryByPage(@RequestParam(name="page ",defaultValue="0")int page,@RequestParam(name="limit",defaultValue="20")int limit) {
		System.out.println("接收到请求：queryByPage");
		PageHelper.startPage(page,limit);
		List<Truck> list = truckService.list();
		PageInfo<Truck> info = new PageInfo<>(list);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "ms");
		map.put("count", info.getTotal());
		map.put("data", info.getList());
		return map;
	}

	@RequestMapping("/add")
	public boolean queryById(Truck truck) {
		System.out.println("接收到请求：add "+ truck);
		boolean flue = truckService.save(truck);
		truckService.update();
		return flue;
	}

	@RequestMapping("/update")
	public boolean update(Truck truck) {
		System.out.println("接收到请求：update "+ truck);
		return truckService.saveOrUpdate(truck);
	}
	
	@RequestMapping("/deleteById")
	@ResponseBody
	public boolean deleteById(String id) {
		System.out.println("接收到请求：deleteById "+ id);
		truckService.removeById(id);
		return true;
	}

	@RequestMapping("/deleteMore")
	@ResponseBody
	public boolean deleteMore(@RequestParam(name="idList")Collection idList) {
		System.out.println("接收到请求：deleteByMore");
		truckService.removeByIds(idList);
		return true;
	}
	
}

