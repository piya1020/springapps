package com.springdemos.springcore.propertyplaceholder;

public class MyDAO {

	private String dburl;
	private String dbuser;
	private String dbpassword;

	public String getDburl() {
		return dburl;
	}

	public void setDburl(String dburl) {
		this.dburl = dburl;
	}

	public String getDbuser() {
		return dbuser;
	}

	public void setDbuser(String dbuser) {
		this.dbuser = dbuser;
	}

	public String getDbpassword() {
		return dbpassword;
	}

	public void setDbpassword(String dbpassword) {
		this.dbpassword = dbpassword;
	}

	@Override
	public String toString() {
		return "MyDAO [dburl=" + dburl + ", dbuser=" + dbuser + ", dbpassword=" + dbpassword + "]";
	}
	public MyDAO(String dburl, String dbuser, String dbpassword) {
		super();
		this.dburl = dburl;
		this.dbuser = dbuser;
		this.dbpassword = dbpassword;
	}

}
