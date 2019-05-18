package com.luis.bms.system.dto;

import java.io.Serializable;

import javax.persistence.Table;

/**  
* @ClassName: RoleMenu  
* @Description: 角色菜单实体类
* @author luis  
* @date 2019年5月18日  
*/
@Table(name="t_role_menu")
public class RoleMenu implements Serializable {
    private Integer id;

    private Integer roleId;

    private Integer menuId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}