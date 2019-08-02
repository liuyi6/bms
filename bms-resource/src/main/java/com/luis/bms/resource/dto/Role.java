package com.luis.bms.resource.dto;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * t_role
 * @author 
 */
@Table(name="t_role")
public class Role implements Serializable {
	
	@Id
    private Integer id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色级别(0:超管，1:普通管理员，2:普通用户)
     */
    private String code;

    private String state;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人id
     */
    private String createAccountId;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 修改人id
     */
    private String updateAccountId;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateAccountId() {
        return createAccountId;
    }

    public void setCreateAccountId(String createAccountId) {
        this.createAccountId = createAccountId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getUpdateAccountId() {
        return updateAccountId;
    }

    public void setUpdateAccountId(String updateAccountId) {
        this.updateAccountId = updateAccountId;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}