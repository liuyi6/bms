package com.luis.bms.system.dao.request;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

public class UpdatePwdRequest implements Serializable{

private static final long serialVersionUID = -221269503729206105L;
	
	@NotBlank
	private Integer id;
	
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
