package org.or.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.or.pojo.Emp;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDao {

	@Resource
	private SessionFactory sf;

	//≤È—Ø
	public List<Emp> empll(String sql) {
	Session session = sf.getCurrentSession();
	SQLQuery sqlQuery = session.createSQLQuery(sql).addEntity(Emp.class);
	List el=sqlQuery.list();
		return el;
	}

	public Emp upll(Integer eid) {
		Session session = sf.getCurrentSession();
		Emp emp = session.get(Emp.class,eid);
		return emp;
	}
}
