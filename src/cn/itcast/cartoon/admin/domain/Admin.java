package cn.itcast.cartoon.admin.domain;

public class Admin {
	private int aid;
	private String ausername;
	private String apassword;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAusername() {
		return ausername;
	}
	public void setAusername(String ausername) {
		this.ausername = ausername;
	}
	public String getApassword() {
		return apassword;
	}
	public void setApassword(String apassword) {
		this.apassword = apassword;
	}
	public Admin(int aid, String ausername, String apassword) {
		super();
		this.aid = aid;
		this.ausername = ausername;
		this.apassword = apassword;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
