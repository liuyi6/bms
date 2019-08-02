package com.luis.bms.resource.dao.vo;

import java.io.Serializable;

public class MenuVO implements Serializable{

	private static final long serialVersionUID = 775095478560377914L;
	
	private Integer id;

    private String name;

    private Integer parentId;

    private String url;
    
    private String type;

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
    
}
