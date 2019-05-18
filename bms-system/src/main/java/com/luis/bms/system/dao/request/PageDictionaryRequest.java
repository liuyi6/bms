package com.luis.bms.system.dao.request;

import com.luis.bms.common.request.PageRequest;

/**  
* @ClassName: PageDictionaryRequest  
* @Description: 字典分页查询请求Request
* @author luis  
* @date 2019年5月18日  
*/
public class PageDictionaryRequest extends PageRequest{

	private static final long serialVersionUID = -6771869930489830772L;
	
	private String type;

    private String code;

    private String name;

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

}
