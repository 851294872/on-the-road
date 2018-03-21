package org.or.service;

import javax.annotation.Resource;

import org.or.dao.DeptDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Servicedept {

	@Resource
	private DeptDao dd;
}
