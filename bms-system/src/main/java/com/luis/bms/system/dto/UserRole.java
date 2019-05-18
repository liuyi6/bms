package com.luis.bms.system.dto;

import java.io.Serializable;

import javax.persistence.Table;

/**  
* @ClassName: UserRole  
* @Description: 用户角色实体类  
* @author luis  
* @date 2019年5月18日  
*/
@Table(name = "t_user_role")
public class UserRole implements Serializable {
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