package cn.itcast.cartoon.category.service;

import java.util.List;

import cn.itcast.cartoon.category.dao.CategoryDao;
import cn.itcast.cartoon.category.domain.Category;

public class CategoryService {
	private CategoryDao categoryDao;

	public CategoryDao getCategoryDao() {
		return categoryDao;
	}

	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	public List<Category> findAllCategory() {
		// TODO Auto-generated method stub
		return this.categoryDao.findAllCategory();
	}

	public void delete(Category category) {
		this.categoryDao.delete(category);
		
	}

	public void add(Category category) {
		this.categoryDao.add(category);
		
	}

	public void update(Category category) {
		this.categoryDao.update(category);
		
	}
	
}
