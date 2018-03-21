package org.or.service;



import java.util.List;

import javax.annotation.Resource;

import org.or.dao.EmpDao;
import org.or.pojo.Emp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Serviceemp {

	@Resource
	private EmpDao ed;

//²éÑ¯
	public List<Emp> selectall(String sql) {
		
		return ed.empll(sql);
	}
//ÐÞ¸Ä
	
	public Emp updatell(Integer eid) {

		return ed.upll(eid);
	}
}
