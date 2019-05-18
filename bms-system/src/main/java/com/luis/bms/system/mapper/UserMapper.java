package com.luis.bms.system.mapper;

import java.util.List;

import com.luis.bms.common.utils.BaseMapper;
import com.luis.bms.system.dto.Menu;
import com.luis.bms.system.dto.User;

public interface UserMapper extends BaseMapper<User>{
	
	public List<Menu> getMenuByUserId(Integer id);

}
