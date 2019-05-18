package com.luis.bms.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luis.bms.common.response.PageResponse;
import com.luis.bms.common.response.Response;
import com.luis.bms.common.utils.ResultCode;
import com.luis.bms.system.dao.request.AddDictionaryRequet;
import com.luis.bms.system.dao.request.PageDictionaryRequest;
import com.luis.bms.system.dao.request.UpdateDictionaryRequet;
import com.luis.bms.system.dto.Dictionary;
import com.luis.bms.system.mapper.DictionaryMapper;
import com.luis.bms.system.service.DictionaryService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;


/**  
* @ClassName: DictionaryServiceImpl  
* @Description: 字典业务实现类 
* @author luis  
* @date 2019年5月18日  
*/
@Service
@Transactional
public class DictionaryServiceImpl implements DictionaryService{

	@Autowired
	private DictionaryMapper dictionaryMapper;
	
	@Override
	public PageResponse<Dictionary> listDictionary(PageDictionaryRequest request) {
		Example example = new Example(Dictionary.class);
		Criteria criteria = example.createCriteria();
		PageResponse<Dictionary> response = new PageResponse<>();
		if(StringUtils.isNotBlank(request.getType())) {
			criteria.andEqualTo("type", request.getType());
		}
		if(StringUtils.isNotBlank(request.getCode())) {
			criteria.andEqualTo("code", request.getCode());
		}
		if(StringUtils.isNotBlank(request.getName())) {
			criteria.andEqualTo("name", request.getName());
		}
		if(StringUtils.isNotBlank(request.getRemark())) {
			criteria.andLike("remark", request.getRemark()+"%");
		}
		PageHelper.startPage(request.getCurrentPage(), request.getPerPageCount());
		List<Dictionary> list = dictionaryMapper.selectByExample(example);
		response.setDataList(list);
		response.setTotalPage(new PageInfo<>(list).getTotal());
		response.setCurrentPage(request.getCurrentPage());
		response.setPerPageCount(request.getPerPageCount());
		return response;
	}

	@Override
	public List<Dictionary> getDictionaryByType(String type) {
		List<Dictionary> list = new ArrayList<>(16);
		if(StringUtils.isNotEmpty(type)) {
			Example example = new Example(Dictionary.class);
			Criteria criteria = example.createCriteria();
			criteria.andEqualTo("type", type);
			list = dictionaryMapper.selectByExample(example);
		}
		return list;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Response addDictionary(AddDictionaryRequet request) {
		Response response = new Response();
		Example example = new Example(Dictionary.class);
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo("type", request.getType());
		criteria.andEqualTo("code", request.getCode());
		if(CollectionUtils.isEmpty(dictionaryMapper.selectByExample(example))) {
			Dictionary dictionary = new Dictionary();
			BeanUtils.copyProperties(request, dictionary);
			dictionary.setCeeateTime(System.currentTimeMillis());
			dictionary.setCreateUser(request.getLoginUserId());
			dictionaryMapper.insertSelective(dictionary);
		} else{
			response.setResultState(ResultCode.C_DUPLICATE);
		}
		return response;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Response updateDictionary(UpdateDictionaryRequet request) {
		Response response = new Response();
		Dictionary dictionary = dictionaryMapper.selectByPrimaryKey(request.getId());
		if(null != dictionary) {
			BeanUtils.copyProperties(request, dictionary);
			dictionary.setUpdateTime(System.currentTimeMillis());
			dictionary.setUpdateUser(request.getLoginUserId());
			dictionaryMapper.updateByPrimaryKeySelective(dictionary);
		}else {
			response.setResultState(ResultCode.C_DATA_NOT_EXIST);
		}
		return response;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Response deleteDictionary(Integer id) {
		Response response = new Response();
		if(null != id) {
			if(null != dictionaryMapper.selectByPrimaryKey(id)) {
				dictionaryMapper.deleteByPrimaryKey(id);
			} else {
				response.setResultState(ResultCode.C_DATA_NOT_EXIST);
			} 
		} else {
			response.setResultState(ResultCode.C_DATA_NOT_IS_NULL);
		}
		return response;
	}
	
}
