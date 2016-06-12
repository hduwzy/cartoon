package cn.itcast.cartoon.collection.domain;

import cn.itcast.cartoon.user.domain.User;

public class Collection {
	private int coid;
	private String pname;
	private String read_record;
	private User user;
	public int getCoid() {
		return coid;
	}
	public void setCoid(int coid) {
		this.coid = coid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getRead_record() {
		return read_record;
	}
	public void setRead_record(String read_record) {
		this.read_record = read_record;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Collection(int coid, String pname, String read_record, User user) {
		super();
		this.coid = coid;
		this.pname = pname;
		this.read_record = read_record;
		this.user = user;
	}
	public Collection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
