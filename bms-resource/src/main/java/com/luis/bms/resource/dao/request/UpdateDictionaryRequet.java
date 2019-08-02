package com.luis.bms.resource.dao.request;

import org.hibernate.validator.constraints.NotBlank;

public class UpdateDictionaryRequet extends AddDictionaryRequet{

	private static final long serialVersionUID = 1L;
	
	@NotBlank
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
