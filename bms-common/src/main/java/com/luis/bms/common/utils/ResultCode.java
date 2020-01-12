package com.luis.bms.common.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: ResultMessage
 * @Description: 统一返回码
 * @author luis
 * @date 2019年5月17日
 */
public class ResultCode {

	public static final Map<String, String> resultMap = new HashMap<String, String>();

	public static String getResultDesc(String code) {
		return resultMap.get(code);
	}

	/* =================公共resultCode========================= */
	public static final String SUCESS = "00000000";
	public static final String FAIL = "99999999";
	public static final String DUPLICATE = "11111111";
	public static final String DATA_NOT_IS_NULL = "00000001";
	public static final String DATA_NOT_EXIST = "00000002";
	public static final String EMPTY_LOGINUSERID = "00000003";
	public static final String EMPTY_TOKEN = "00000004";
	public static final String EMPTY_STREAMNO = "00000005";

	/* ========================================== */
	static {
		resultMap.put(SUCESS, "成功!");
		resultMap.put(FAIL, "失败!");
		resultMap.put(DUPLICATE, "数据重复!");
		resultMap.put(DATA_NOT_IS_NULL, "数据不能为空!");
		resultMap.put(DATA_NOT_EXIST, "数据不存在!");
		resultMap.put(EMPTY_LOGINUSERID, "loginUserId为空!");
		resultMap.put(EMPTY_TOKEN, "token为空!");
		resultMap.put(EMPTY_STREAMNO, "streamNo为空!");
	}
}
