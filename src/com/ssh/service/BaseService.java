package com.ssh.service;

import java.util.List;

/**TODO
 * @author：Alice
 * @date: 2018年5月30日
 * @version 0.0.4
 * @description：在业务层提供访问DAO层Service接口
 */
public interface BaseService {
	
	/** 设置实体类 */
	public void setClass();
	
	/** 设置实体类 */
	public void setClass(String cl);
	
	/** 添加数据 */
	public void addData(Object obj);
	
	/** 删除数据 */
	public void delData(Object obj);
	
	/** 获取数据 */
	public Object getData(Class cl, int id);
	
	/** 获取数据 */
	public Object getData(String cl, int id);
	
	/** 获取数据 */
	public Object getData(int id);
	
	/** 获取数据列表 */
	public List getDataList();
	
	/** 获取数据列表 */
	public List getDataList(Object... pairParms);
	
	/** 搜索数据 */
	public<Object> List searchList(String keyWord);
	
	/** 更新数据 */
	public void updateData(Object obj);

}
