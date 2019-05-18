package com.luis.bms.common.request;

import java.util.List;

/**  
* @ClassName: KeysRequest  
* @Description: 批量数字集合统一处理请求 
* @author luis  
* @date 2019年5月18日  
*/
public class KeysRequest extends Request{
	
	private static final long serialVersionUID = 8345506326635419916L;
	
	private List<Integer> ids;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
}
