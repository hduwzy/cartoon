package cn.itcast.cartoon.admin.action;

import cn.itcast.cartoon.admin.domain.Admin;
import cn.itcast.cartoon.admin.service.AdminService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class AdminAction extends ActionSupport implements ModelDriven<Admin>{
	private AdminService adminService;
	private Admin admin=new Admin();
	public Admin getModel() {
		// TODO Auto-generated method stub
		return admin;
	}
	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public String login(){
		Admin adminuser=adminService.query(admin.getAusername(),admin.getApassword());
		if(adminuser!=null){
			return "LoginSuccess";
		}else{
			return "LoginFail";
		}
		
	}
	

	

	
}
