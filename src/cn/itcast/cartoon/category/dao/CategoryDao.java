package cn.itcast.cartoon.category.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.cartoon.category.domain.Category;

public class CategoryDao extends HibernateDaoSupport{

	public List<Category> findAllCategory() {
		String hql="from Category";
		return this.getHibernateTemplate().find(hql);
	}

	public void delete(Category category) {
		this.getHibernateTemplate().delete(category);
		
	}

	public void add(Category category) {
		this.getHibernateTemplate().save(category);
		
	}

	public void update(Category category) {
		this.getHibernateTemplate().update(category);
		
	}

}
