package org.or.web;


import java.util.List;

import javax.annotation.Resource;

import org.or.pojo.Dept;
import org.or.pojo.Emp;
import org.or.service.Servicedept;
import org.or.service.Serviceemp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Coreller {

	@Resource
	private Servicedept sd;
	@Resource
	private Serviceemp se;
	
	@RequestMapping("/list")
public String fn1(ModelMap map,Emp emp) {
		String sql=" select * from emp ";
		List<Emp>el=se.selectall(sql);
		map.put("el", el);
		//map.put("tl", emp);
	return "emplist";
	
}
	@RequestMapping("/list")
public String fn1(ModelMap map,Dept dept) {
		String sql=" select * from emp ";
		List<Emp>el=se.selectall(sql);
		map.put("el", el);
		//map.put("tl", emp);
	return "emplist";
	
}
	
	@RequestMapping("/update")
	public String  update(Integer eid ) {
		Emp el=se.updatell(eid);
		return "redirect:emplist";
		
	}
}
