package com.luis.bms.common.request;

/**  
* @ClassName: QueryRequest  
* @Description: 单个字符串查询请求  
* @author luis  
* @date 2019年5月18日  
*/
public class QueryRequest  extends Request{
	
	private static final long serialVersionUID = 8345506326635419916L;
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
