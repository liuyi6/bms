package com.luis.bms.system.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luis.bms.system.dto.Menu;
import com.luis.bms.system.mapper.MenuMapper;
import com.luis.bms.system.service.MenuService;

/**  
* @ClassName: MenuServiceImpl  
* @Description: 菜单业务实现类  
* @author luis  
* @date 2019年5月18日  
*/
@Service
@Transactional
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuMapper menuMapper;

	@Override
	public Map<Integer, List<Menu>> getMneuTree(List<Menu> list) {
		
		return null;
	}
}
