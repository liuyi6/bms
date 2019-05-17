package com.luis.bms.system.dto;

import java.io.Serializable;

/**
 * t_role
 * @author 
 */
public class Role implements Serializable {
    private Integer id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色级别(0:超管，1:普通管理员，2:普通用户)
     */
    private String level;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人id
     */
    private Integer createUser;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 修改人id
     */
    private Integer updateUser;

    /**
     * 修改时间
     */
    private Long updateTime;

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}