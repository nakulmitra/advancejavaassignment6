package com.nagarro.flight.search.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class --> User
 * @author nakulmitra
 * Description --> getter and setter methods of User class with toString method.
 */
@Entity
@Table(name = "user_login")
public class User {
	@Id
	private String userid;
	@Column(name = "password")
	private String pass;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", pass=" + pass + "]";
	}

}
