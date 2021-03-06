package com.ssh.serviceImpl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.daoImpl.DAOImpl;
import com.ssh.service.BaseService;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * TODO
 * 
 * @author：Alice
 * @date: 2018年5月30日
 * @version 0.0.4
 * @description：实现业务层BaseService接口
 */
@Service
public class BaseServiceImpl implements BaseService {

	@Autowired
	protected DAOImpl dao;

	protected Class cl;

	public BaseServiceImpl() {
		// setClass();
	}

	/** 设置实体类 */
	@Override
	public void setClass() {
		try {
			throw new Exception();
		} catch (Exception e0) {
			StackTraceElement stes[] = e0.getStackTrace();
			String serviceImpleClassName = stes[1].getClassName();
			try {
				Class serviceImplClass = Class.forName(serviceImpleClassName);
				String serviceImpleClassSimpleName = serviceImplClass.getSimpleName();
				String entitySimpleName = serviceImpleClassSimpleName.replaceAll("ServiceImpl", "");
				String entityPackageName = serviceImplClass.getPackage().getName().replaceAll(".serviceImpl",
						".entity");
				String entityFullName = entityPackageName + "." + entitySimpleName;
				// System.out.println("serviceImpleClassSimpleName:" +
				// serviceImpleClassSimpleName);
				// System.out.println("entitySimpleName:" + entitySimpleName);
				// System.out.println("entityPackageName:" + entityPackageName);
				// System.out.println("entityFullName:" + entityFullName);
				cl = Class.forName(entityFullName);
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
		}
	}

	/**
	 * 设置实体类
	 * 
	 * @param cl 实体类名
	 */
	@Override
	public void setClass(String cl) {
		try {
			this.cl = Class.forName("com.ssh.entity." + cl);
			System.out.println(this.cl.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/*
	 * public void showClassName() { System.out.println(cl); }
	 * 
	 * public static void main(String[] args) { // new
	 * MemberServiceImpl().showClassName(); }
	 */

	/** 添加数据 */
	@Override
	public void addData(Object obj) {
		dao.save(obj);
	}

	/** 删除数据 */
	@Override
	public void delData(Object obj) {
		dao.delete(obj);
	}

	/**
	 * 获取数据
	 * 
	 * @param cl 实体类
	 * @param id 实体类对应ID
	 */
	@Override
	public Object getData(Class cl, int id) {
		return dao.get(cl, id);
	}

	/**
	 * 获取数据
	 * 
	 * @param cl 实体类名
	 * @param id 实体类对应ID
	 */
	@Override
	public Object getData(String cl, int id) {
		return dao.get(cl, id);
	}

	/**
	 * 获取数据
	 * 
	 * @param id 实体类对应ID
	 */
	@Override
	public Object getData(int id) {
		return dao.get(cl, id);
	}

	/** 
	 * 获取数据列表
	 * 
	 * @return 数组对象
	 */
	@Override
	public List<Object> getDataList() {
		DetachedCriteria query = DetachedCriteria.forClass(cl);
		query.addOrder(Order.desc("id")); // 根据ID排序
		return dao.findByCriteria(query);
	}
	
	/** 
	 * 获取数据列表
	 * 
	 * @param pairParms 参数列表{key, value, ... ,key, value}
	 * @return 数组对象
	 */
	@Override
	public List getDataList(Object... pairParms) {
		HashMap<String, Object> map = new HashMap<>();
		// 按照key,value,key,value,key,value取值放入放进Map
		for (int i = 0; i < pairParms.length; i = i + 2) {
			map.put(pairParms[i].toString(), pairParms[i + 1]);
		}
		DetachedCriteria query = DetachedCriteria.forClass(cl);
		// 使用QBC实现动态查询 
		Set<String> ks = map.keySet();
		for (String key : ks) {
			if (null == map.get(key)) {
				query.add(Restrictions.isNull(key));
			} else {
				query.add(Restrictions.eq(key, map.get(key)));
			}
		}
		query.addOrder(Order.desc("id")); // 根据ID排序
		return dao.findByCriteria(query);
	}
	
	/** 搜索数据 */
	@Override
	public List<Object> searchList(String keyWord) {
        DetachedCriteria query = DetachedCriteria.forClass(cl);
        query.add(Restrictions.like("name", "%"+ keyWord + "%"));
        return dao.findByCriteria(query);
	}

	/** 更新数据 */
	@Override
	public void updateData(Object obj) {
		dao.update(obj);
	}

}
