package com.luis.bms.system.dto;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

/**  
* @ClassName: Dictionary  
* @Description: 字典实体类
* @author luis  
* @date 2019年5月18日  
*/

@Table(name="t_dictionary")
public class Dictionary implements Serializable {
	@Id
	private Integer id;

    private String type;

    private String code;

    private String name;

    private String remark;

    private String createUser;

    private Long ceeateTime;

    private String updateUser;

    private Long updateTime;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getCeeateTime() {
        return ceeateTime;
    }

    public void setCeeateTime(Long ceeateTime) {
        this.ceeateTime = ceeateTime;
    }
    
    public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}