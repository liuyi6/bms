package com.luis.bms.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.bms.system.dao.DictionaryMapper;
import com.luis.bms.system.dto.Dictionary;
import com.luis.bms.system.service.DictionaryService;

@Service
public class DictionaryServiceImpl implements DictionaryService{

	@Autowired
	private DictionaryMapper dictionaryMapper;
	
	@Override
	public List<Dictionary> listDictionary() {
		List<Dictionary> list = dictionaryMapper.selectAll();
//		List<Dictionary> list = new ArrayList<>();
//		Dictionary dictionary = new Dictionary();
//		dictionary.setType("1");
//		list.add(dictionary);
		return list;
	}
	
	

}
