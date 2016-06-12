package cn.itcast.cartoon.user.domain;

import java.util.HashSet;
import java.util.Set;

import cn.itcast.cartoon.collection.domain.Collection;

public class User {
	private int uid;
	private String username;
	private String password;
	private String email;
	private int state;
	private Set<Collection> collections=new HashSet<Collection>();
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Set<Collection> getCollections() {
		return collections;
	}
	public void setCollections(Set<Collection> collections) {
		this.collections = collections;
	}
	public User(int uid, String username, String password, String email,
			int state, Set<Collection> collections) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.state = state;
		this.collections = collections;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
