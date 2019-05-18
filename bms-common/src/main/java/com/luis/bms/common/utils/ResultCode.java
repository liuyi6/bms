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
	
	/*=================公共resultCode=========================*/
	public static final String C_SUCESS ="00000000";
	public static final String C_FAIL ="99999999";
	public static final String C_DUPLICATE ="11111111";
	public static final String C_DATA_NOT_IS_NULL ="00000001";
	public static final String C_DATA_NOT_EXIST ="00000002";
	
	/*==========================================*/
	static {
		resultMap.put(C_SUCESS, "成功!");
		resultMap.put(C_FAIL, "失败!");
		resultMap.put(C_DUPLICATE, "数据重复!");
		resultMap.put(C_DATA_NOT_IS_NULL, "数据不能为空!");
		resultMap.put(C_DATA_NOT_EXIST, "数据不存在!");
	}
}
