package com.luis.bms.system.dao.request;

import com.luis.bms.common.request.PageRequest;

public class PageUserRequest extends PageRequest{

	private static final long serialVersionUID = 4533675271841910888L;
	
	private String userName;

    private String email;

    private String phone;
    
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
