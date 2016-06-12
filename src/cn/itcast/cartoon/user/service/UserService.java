package cn.itcast.cartoon.user.service;

import java.util.List;

import cn.itcast.cartoon.user.dao.UserDao;
import cn.itcast.cartoon.user.domain.User;
import cn.itcast.cartoon.utils.PageBean;

public class UserService {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	

	public void delete(User user) {
		userDao.delete(user);
		
	}

	public PageBean<User> findAllUser(int page, int limit) {
		// TODO Auto-generated method stub
		return userDao.findAllUser(page,limit);
	}

	
	
}
