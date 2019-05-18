package com.luis.bms.web;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luis.bms.common.request.KeyRequest;
import com.luis.bms.common.request.QueryRequest;
import com.luis.bms.common.response.PageResponse;
import com.luis.bms.common.response.Response;
import com.luis.bms.common.utils.ResultCode;
import com.luis.bms.system.dao.request.AddDictionaryRequet;
import com.luis.bms.system.dao.request.PageDictionaryRequest;
import com.luis.bms.system.dao.request.UpdateDictionaryRequet;
import com.luis.bms.system.dto.Dictionary;
import com.luis.bms.system.service.DictionaryService;

import io.swagger.annotations.ApiOperation;

/**  
* @ClassName: DictionaryControllor  
* @Description: 字典暴露接口 
* @author luis  
* @date 2019年5月18日  
*/
@RequestMapping("/bms/dictionary")
@Controller
public class DictionaryControllor {
	
	@Autowired
	private DictionaryService dictionaryService;
	
	@RequestMapping(value = "/listDictionary",method = RequestMethod.GET)
	@ApiOperation(value="分页查询字典数据")
	@ResponseBody
	public PageResponse<Dictionary> listDictionary(@ModelAttribute PageDictionaryRequest request) {
		PageResponse<Dictionary> response = new PageResponse<>();
		response = dictionaryService.listDictionary(request);
		response.setStreamNo(request.getStreamNo());
		return response;
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/addDictionary",method = RequestMethod.POST)
	@ApiOperation(value="新增字典数据")
	@ResponseBody
	public Response addDictionary(@ModelAttribute AddDictionaryRequet request) {
		Response response = new Response<>();
		response = dictionaryService.addDictionary(request);
		response.setStreamNo(request.getStreamNo());
		return response;
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/updateDictionary",method = RequestMethod.PUT)
	@ApiOperation(value="修改字典数据")
	@ResponseBody
	public Response updateDictionary(@ModelAttribute UpdateDictionaryRequet request) {
		Response response = new Response<>();
		response = dictionaryService.updateDictionary(request);
		response.setStreamNo(request.getStreamNo());
		return response;
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/delDictionary",method = RequestMethod.DELETE)
	@ApiOperation(value="删除字典数据")
	@ResponseBody
	public Response delDictionary(@ModelAttribute KeyRequest request) {
		Response response = new Response<>();
		response = dictionaryService.deleteDictionary(request.getId());
		response.setStreamNo(request.getStreamNo());
		return response;
	}
	
	@RequestMapping(value = "/queryDicByType",method = RequestMethod.GET)
	@ApiOperation(value="根据类型查询字典数据")
	@ResponseBody
	public Response<List<Dictionary>> queryDicByType(@ModelAttribute QueryRequest request) {
		Response<List<Dictionary>> response = new Response<>();
		if(StringUtils.isNotEmpty(request.getValue())) {
			response.setData(dictionaryService.getDictionaryByType(request.getValue()));
		} else {
			response.setResultState(ResultCode.C_DATA_NOT_IS_NULL);
		}
		response.setStreamNo(request.getStreamNo());
		return response;
	}
	

}
