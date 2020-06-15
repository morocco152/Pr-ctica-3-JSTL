/**
 * 
 */
package com.ecodeup.com;

import java.io.Serializable;

/**
 * @author lm
 *
 */
public class Person implements Serializable {

	private int userid;
	private String password;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the userid
	 */
	public int getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
