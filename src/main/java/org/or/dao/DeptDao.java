package org.or.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDao {

	@Resource
	private SessionFactory sf;
}
