package com.ssh.interceptor;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;  

import com.ssh.entity.Admin;

/**TODO
 * @author：Alice
 * @date: 2018年6月19日
 * @version 0.0.1
 * @description：后台权限校验的拦截器类
 */
public class AdminInterceptor extends AbstractInterceptor {
	@Override
	// 执行拦截器方法 
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ctx = invocation.getInvocationContext();
		HttpServletResponse response = (HttpServletResponse) ctx.get(StrutsStatics.HTTP_RESPONSE);
		HttpServletRequest request = (HttpServletRequest) ctx.get(StrutsStatics.HTTP_REQUEST);
		ServletContext servletContext = (ServletContext) ctx.get(StrutsStatics.SERVLET_CONTEXT);
		// 获取控制器名称
		String contextPath = servletContext.getContextPath();
		String URL = request.getRequestURI();
		String authPageStr = StringUtils.remove(URL, contextPath);
		// 匹配后“admin_”开头控制器字符串
		if (authPageStr.startsWith("/admin_")) {
			Admin admin = (Admin) ctx.getSession().get("admin");
			// 无管理员对象返回登录页面
			if (null == admin) {
				response.sendRedirect("adminLogin.jsp");
				return null;
			}
		}
		return invocation.invoke();
	}
}
