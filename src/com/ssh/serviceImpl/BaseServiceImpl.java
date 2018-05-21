package com.ssh.serviceImpl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.daoImpl.DAOImpl;
import com.ssh.entity.Food;
import com.ssh.service.BaseService;

import java.util.List;

/**TODO
 * @author：Alice
 * @date: 2018年5月12日
 * @version 0.0.1
 * @description：实现业务层BaseService接口
 */
@Service
public class BaseServiceImpl implements BaseService {

	@Autowired
	protected DAOImpl dao;

	protected Class cl;

	public BaseServiceImpl() {
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
				System.out.println("serviceImpleClassSimpleName:" + serviceImpleClassSimpleName);
				System.out.println("entitySimpleName:" + entitySimpleName);
				System.out.println("entityPackageName:" + entityPackageName);
				System.out.println("entityFullName:" + entityFullName);
				cl = Class.forName(entityFullName);
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
		}
	}

	/** 显示当前类名 */
	public void showClass() {
		System.out.println(cl);
	}

	public static void main(String[] args) {
		// new MemberServiceImpl().showClass();
	}

	@Override
	public void addData(Object obj) {
		dao.save(obj);
	}

	@Override
	public void delData(Object obj) {
		dao.delete(obj);
	}

	@Override
	public Object getData(Class cl, int id) {
		return dao.get(cl, id);
	}

	@Override
	public Object getData(int id) {
		return dao.get(cl, id);
	}

	@Override
	public List<Object> getDataList() {
		DetachedCriteria query = DetachedCriteria.forClass(cl);
		query.addOrder(Order.desc("id")); // 根据ID排序
		return dao.findByCriteria(query);
	}

	@Override
	public void updateData(Object obj) {
		dao.update(obj);
	}

}
