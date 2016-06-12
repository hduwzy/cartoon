package cn.itcast.cartoon.admin.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.cartoon.admin.domain.Admin;

public class AdminDao extends HibernateDaoSupport{

	public Admin query(String ausername, String apassword) {
		String hql="from Admin where ausername = ? and apassword = ?";
		List<Admin> list=this.getHibernateTemplate().find(hql,new Object[]{ausername,apassword});
		if(list!=null&&list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
		
	}

}
