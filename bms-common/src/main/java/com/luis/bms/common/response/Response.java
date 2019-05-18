package com.luis.bms.common.response;

import java.io.Serializable;

import com.luis.bms.common.utils.ResultCode;

/**  
* @ClassName: Response  
* @Description: 统一返回对象
* @author luis  
* @date 2019年5月16日  
*/
public class Response<T> implements Serializable{

	private static final long serialVersionUID = 5381699058051240205L;
	
	private String streamNo;
	
	private String resultCode;
	
	private String resultDesc;
	
	private T data;
	
	public Response() {
		setResultState(ResultCode.C_SUCESS);
	}

	public String getStreamNo() {
		return streamNo;
	}

	public void setStreamNo(String streamNo) {
		this.streamNo = streamNo;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDesc() {
		return resultDesc;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public void setResultState(String resultCode) {
		setResultCode(resultCode);
		setResultDesc(ResultCode.getResultDesc(resultCode));
	}
}
