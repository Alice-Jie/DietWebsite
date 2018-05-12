package com.ssh.daoImpl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**TODO
 * @author：Alice
 * @date: 2018年5月7日
 * @version 0.0.1
 * @description：在DAO层提供访问Hibernate层
 */
@Repository("dao")
public class DAOImpl extends HibernateTemplate {
	@Resource(name = "sf")
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	};
}