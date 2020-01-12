package com.luis.bms.common.request;

import java.io.Serializable;

/**
 * @ClassName: Request
 * @Description: 统一请求对象
 * @author luis
 * @date 2019年5月16日
 */
public class Request implements Serializable {

	private static final long serialVersionUID = 5640213597602374902L;

	private String streamNo;

	private String loginUserId;

	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getStreamNo() {
		return streamNo;
	}

	public void setStreamNo(String streamNo) {
		this.streamNo = streamNo;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

}
