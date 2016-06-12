package cn.itcast.cartoon.utils;



import cn.itcast.cartoon.admin.domain.Admin;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class AdminInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		Admin admin=(Admin) ActionContext.getContext().getSession().get("adminuser");
		if(admin==null){
			ActionSupport actionSupport=(ActionSupport) arg0.getAction();
			actionSupport.addActionError("未登陆");
			return "nologin";
		}else{
			return arg0.invoke();
		}
		
	}
	
}
