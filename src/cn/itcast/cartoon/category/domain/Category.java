package cn.itcast.cartoon.category.domain;

import java.util.HashSet;
import java.util.Set;

import cn.itcast.cartoon.categorysecond.domain.CategorySecond;

public class Category {
	private int cid;
	private String cname;
	private Set<CategorySecond> categorySeconds=new HashSet<CategorySecond>();
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Set<CategorySecond> getCategorySeconds() {
		return categorySeconds;
	}
	public void setCategorySeconds(Set<CategorySecond> categorySeconds) {
		this.categorySeconds = categorySeconds;
	}
	public Category(int cid, String cname, Set<CategorySecond> categorySeconds) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.categorySeconds = categorySeconds;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
