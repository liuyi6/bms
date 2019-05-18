package com.luis.bms.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.luis.bms.common.request.Request;
import com.luis.bms.common.response.Response;
import com.luis.bms.system.dto.Dictionary;
import com.luis.bms.system.service.DictionaryService;
import com.luis.bms.system.service.impl.DictionaryServiceImpl;

import io.swagger.annotations.ApiOperation;

@RequestMapping("/bms/dictionary")
@Controller
public class DictionaryControllor {
	
	@Autowired
	private DictionaryService dictionaryService;
	
	@RequestMapping(value = "/listDictionary",method = RequestMethod.GET)
	@ApiOperation(value="分页查询字典数据")
	@ResponseBody
	public Response<List<Dictionary>> listDictionary(@ModelAttribute Request request) {
		Response<List<Dictionary>> response = new Response<>();
		List<Dictionary> list = dictionaryService.listDictionary();
//		List<Dictionary> list = new ArrayList<>(10);
//		Dictionary dictionary = new Dictionary();
//		dictionary.setType("1");
//		list.add(dictionary);
		response.setData(list);
		return response;
	}
	

}
