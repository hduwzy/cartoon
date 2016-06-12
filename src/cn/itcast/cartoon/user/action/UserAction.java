package cn.itcast.cartoon.user.action;

import java.util.List;

import cn.itcast.cartoon.user.domain.User;
import cn.itcast.cartoon.user.service.UserService;
import cn.itcast.cartoon.utils.PageBean;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	
	private User user=new User();
	private UserService userService;
	private int page;
	private int limit=10;
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String findAllUser(){
		PageBean<User> pageBean=userService.findAllUser(page,limit);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAllUser";
	}
	public String delete(){
		userService.delete(user);
		return "tolist";
	}
}
