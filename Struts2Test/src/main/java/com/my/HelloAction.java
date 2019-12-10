package com.my;

import com.opensymphony.xwork2.Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.HttpParameters;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author 43735
 * @Date: Created in 2019/10/30 15:34
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class HelloAction extends ActionSupport {

	@Override
	public String execute(){
		ActionContext actionContext = ActionContext.getContext();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();

		return null;
	}

}
