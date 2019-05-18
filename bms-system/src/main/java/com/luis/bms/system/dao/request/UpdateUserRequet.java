package com.luis.bms.system.dao.request;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

public class UpdateUserRequet implements Serializable{

	private static final long serialVersionUID = -221269503729206105L;
	
	@NotBlank
	private Integer id;
	
	private String userName;

    private String nickName;

    private String email;

    private String phone;

    private String remark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
