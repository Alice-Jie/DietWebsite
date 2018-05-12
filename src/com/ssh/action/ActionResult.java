package com.ssh.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**TODO
 * @author：Alice
 * @date: 2018年5月12日
 * @version 0.0.2
 * @description：继承ActionService，专注于处理JSP返回页面以及路径映射
 */
@Namespace("/")
@ParentPackage("mypack")
@Results({ 
		@Result(name = "foodList", location = "/admin/foodList.jsp"),
		@Result(name = "foodListPage", type = "redirect", location = "/admin_foodList"),
		@Result(name = "editFood", location = "/admin/editFood.jsp"), 
})
public class ActionResult extends ActionService {

}