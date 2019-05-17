package com.luis.bms.system.dto;

import java.io.Serializable;

/**
 * t_menu
 * @author 
 */
public class Menu implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 父菜单id
     */
    private Integer parentId;

    /**
     * 菜单路径
     */
    private String url;

    /**
     * 类型(0为主菜单，1为子菜单)
     */
    private String type;

    /**
     * 排序
     */
    private String sort;

    /**
     * 状态(1为有效，0为无效)
     */
    private String state;

    /**
     * 创建者id
     */
    private String craeteUser;

    /**
     * 创建时间
     */
    private Long craeteTime;

    /**
     * 修改人id
     */
    private Integer updateUser;

    /**
     * 修改时间
     */
    private Long createTime;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCraeteUser() {
        return craeteUser;
    }

    public void setCraeteUser(String craeteUser) {
        this.craeteUser = craeteUser;
    }

    public Long getCraeteTime() {
        return craeteTime;
    }

    public void setCraeteTime(Long craeteTime) {
        this.craeteTime = craeteTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}