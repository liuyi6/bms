package com.luis.bms.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.bms.system.dao.DictionaryDAO;
import com.luis.bms.system.dto.Dictionary;
import com.luis.bms.system.service.DictionaryService;

@Service
public class DictionaryServiceImpl implements DictionaryService{
	
	@Autowired
	private DictionaryDAO dictionaryDAO;
	
	public List<Dictionary> getDicList() {
		
		return null;
	}

}
