package com.luis.bms.resource.dto;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * t_dictionary
 * @author 
 */
@Table(name="t_dictionary")
public class Dictionary implements Serializable {
	
	@Id
    private Integer id;

    private String type;

    private String code;

    private String value;

    private String state;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
}