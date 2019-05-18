package com.luis.bms.system.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.luis.bms.common.request.PageRequest;
import com.luis.bms.common.response.PageResponse;
import com.luis.bms.common.response.Response;
import com.luis.bms.system.dto.Menu;
import com.luis.bms.system.dto.Role;
import com.luis.bms.system.dto.User;
import com.luis.bms.system.dto.UserRole;
import com.luis.bms.system.mapper.MenuMapper;
import com.luis.bms.system.mapper.RoleMapper;
import com.luis.bms.system.mapper.RoleMenuMapper;
import com.luis.bms.system.mapper.UserMapper;
import com.luis.bms.system.mapper.UserRoleMapper;
import com.luis.bms.system.service.MenuService;
import com.luis.bms.system.service.UserService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Resource
	private RoleMapper roleMapper;
	
	@Resource
	private MenuMapper menuMapper;
	
	@Resource
	private RoleMenuMapper roleMenuMapper;
	
	@Resource
	private UserRoleMapper userRoleMapper;
	
	@Resource
	private MenuService MenuService;
	
	@Override
	public PageResponse<User> listUser(PageRequest request) {
		return null;
	}

	@Override
	public User getUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Role> getRolesByUserId(Integer id) {
		Example example = new Example(UserRole.class);
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo("userId", id);
		List<UserRole> roles = userRoleMapper.selectByExample(example);
		
		Example example2 = new Example(Role.class);
		Criteria criteria2 = example2.createCriteria();
		criteria2.andIn("id", roles);
		return roleMapper.selectByExample(example2);
	}

	@Override
	public Map<Integer, List<Menu>> getMenuByUserId(Integer id) {
		Map<Integer, List<Menu>> map = new HashMap<>();
		List<Menu> list = userMapper.getMenuByUserId(id);
		if(!CollectionUtils.isEmpty(list)) {
			map = MenuService.getMneuTree(list);
		}
		return map;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Response addUser() {
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Response updateUser() {
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Response deleteUser() {
		return null;
	}

}
