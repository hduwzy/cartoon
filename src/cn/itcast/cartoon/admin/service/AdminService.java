package cn.itcast.cartoon.admin.service;

import cn.itcast.cartoon.admin.dao.AdminDao;
import cn.itcast.cartoon.admin.domain.Admin;

public class AdminService {
	private AdminDao adminDao;
	
	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public Admin query(String ausername, String apassword) {
		
		return adminDao.query(ausername,apassword);
	}

}
