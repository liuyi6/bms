package com.luis.bms.resource.dao.request;

import com.luis.bms.common.request.Request;

public class AddDictionaryRequet extends Request{
	
	private static final long serialVersionUID = 598851189121577806L;

	private String type;

    private String code;

    private String value;

    private String remark;

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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
