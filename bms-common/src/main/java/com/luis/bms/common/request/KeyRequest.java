package com.luis.bms.common.request;

/**  
* @ClassName: KeyRequest  
* @Description: 数字处理请求 
* @author luis  
* @date 2019年5月18日  
*/
public class KeyRequest extends Request{
	
	private static final long serialVersionUID = 8345506326635419916L;
	
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
