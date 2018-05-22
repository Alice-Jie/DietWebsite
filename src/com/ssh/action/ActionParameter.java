package com.ssh.action;

/**TODO
 * @author：Alice
 * @date: 2018年5月22日
 * @version 0.0.1
 * @description：继承ActionService，专注于处理各种参数
 */
public class ActionParameter extends ActionService {

    protected String msg;  // 错误消息
 
    /** setter、getter */
    
    public String getMsg() {
        return msg;
    }
 
    public void setMsg(String msg) {
        this.msg = msg;
    }
	
}
