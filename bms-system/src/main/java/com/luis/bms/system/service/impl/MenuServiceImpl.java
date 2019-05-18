package com.luis.bms.system.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luis.bms.system.dao.vo.MenuVO;
import com.luis.bms.system.dto.Menu;
import com.luis.bms.system.mapper.MenuMapper;
import com.luis.bms.system.service.MenuService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

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
	public Map<Integer, List<MenuVO>> getMneuTree(List<MenuVO> list) {
		Map<Integer, List<MenuVO>> map = new HashMap<>();
		for (MenuVO menuvo : list) {
			if(map.containsKey(menuvo.getParentId())) {
				List<MenuVO> menuVOs = map.get(menuvo.getParentId());
				menuVOs.add(menuvo);
				map.put(menuvo.getParentId(), menuVOs);
			}else {
				List<MenuVO> menuVOs = new ArrayList<>(list.size());
				menuVOs.add(menuvo);
				map.put(menuvo.getParentId(), menuVOs);
			}
		}
		return map;
	}
}
