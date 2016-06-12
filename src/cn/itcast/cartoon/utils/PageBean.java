package cn.itcast.cartoon.utils;

import java.util.List;

public class PageBean<T> {
	private int page;
	private int limit;
	private int totalCount;
	private List<T>list;
	private int pageCount;
	private int beginIndex;
	private int endIndex;
	
	public PageBean() {
		super();
	}
	//只需要4个参数
	public PageBean(int page, int limit, int totalCount, List<T> list) {
		super();
		this.page = page;
		this.limit = limit;
		this.totalCount = totalCount;
		this.list = list;
		int n=totalCount/limit;
		this.pageCount=totalCount%limit==0?n:n+1;
		if(pageCount<=10){
			this.beginIndex=1;
			this.endIndex=10;
		}else{
			beginIndex=page-4;
			endIndex=page+5;
			if(beginIndex<=1){
				beginIndex=1;
				endIndex=10;
			}
			if(endIndex>pageCount){
				endIndex=pageCount-9;
			}
		}
	}

	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getBeginIndex() {
		return beginIndex;
	}
	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}
	public int getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
	
}
