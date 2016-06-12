package cn.itcast.cartoon.user.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.cartoon.user.domain.User;
import cn.itcast.cartoon.utils.PageBean;
import cn.itcast.cartoon.utils.PageHibernateCallback;

public class UserDao extends HibernateDaoSupport{
	
	public PageBean<User> findAllUser(int page, int limit) {
		String hql="select count(*) from User";
		Long c=(Long) this.getHibernateTemplate().find(hql).listIterator().next();
		int totalCount=c.intValue();
		hql="from User";
		PageHibernateCallback<User> callback=new PageHibernateCallback<User>(hql, null, (page-1)*limit, limit);
		List<User> list=(List<User>) this.getHibernateTemplate().execute(callback);
		return new PageBean<User>(page, limit, totalCount, list);
	}
	public  void delete(User user) {
		this.getHibernateTemplate().delete(user);
		
	}
}
