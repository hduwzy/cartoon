package cn.itcast.cartoon.categorysecond.domain;

import cn.itcast.cartoon.category.domain.Category;

public class CategorySecond {
	private int csid;
	private String csname;
	private Category category;
	public int getCsid() {
		return csid;
	}
	public void setCsid(int csid) {
		this.csid = csid;
	}
	public String getCsname() {
		return csname;
	}
	public void setCsname(String csname) {
		this.csname = csname;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public CategorySecond(int csid, String csname, Category category) {
		super();
		this.csid = csid;
		this.csname = csname;
		this.category = category;
	}
	public CategorySecond() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
