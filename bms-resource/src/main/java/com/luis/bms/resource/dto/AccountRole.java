package com.luis.bms.resource.dto;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * t_account_role
 * @author 
 */
@Table(name="t_account_role")
public class AccountRole implements Serializable {
	
	@Id
    private Integer id;

    private Integer userId;

    private Integer roleId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}