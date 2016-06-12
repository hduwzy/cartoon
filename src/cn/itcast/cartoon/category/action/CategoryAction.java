package cn.itcast.cartoon.category.action;

import java.util.List;

import cn.itcast.cartoon.category.domain.Category;
import cn.itcast.cartoon.category.service.CategoryService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CategoryAction extends ActionSupport implements ModelDriven<Category>{
	private Category category=new Category();
	private CategoryService categoryService;
	public Category getModel() {
		// TODO Auto-generated method stub
		return category;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public CategoryService getCategoryService() {
		return categoryService;
	}
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	public String findAllCategory(){
		List<Category> list=categoryService.findAllCategory();
		ActionContext.getContext().put("cList", list);
		return "findAllCategory";
	}
	public String delete(){
		categoryService.delete(category);
		return "tolist";
	}
	public String addUI(){
		return "addUI";
	}
	public String add(){
		categoryService.add(category);
		return "tolist";
	}
	public String editUI(){
		return "editUI";
	}
	public String edit(){
		categoryService.update(category);
		return "tolist";
	}
}
