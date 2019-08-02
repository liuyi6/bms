package com.luis.bms.resource.service.impl;

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
import com.luis.bms.resource.service.AccountService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

//	@Autowired
//	private AccountMapper userMapper;
//	
//	@Resource
//	private RoleMapper roleMapper;
//	
//	@Resource
//	private MenuMapper menuMapper;
//	
//	@Resource
//	private RoleMenuMapper roleMenuMapper;
//	
//	@Resource
//	private AccountRoleMapper userRoleMapper;
//	
//	@Resource
//	private MenuService menuService;
//	
//	@Override
//	public PageResponse<Account> listUser(PageRequest request) {
//		return null;
//	}
//
//	@Override
//	public Account getUserById(Integer id) {
//		return userMapper.selectByPrimaryKey(id);
//	}
//
//	@Override
//	public List<Role> getRolesByUserId(Integer id) {
//		Example example = new Example(AccountRole.class);
//		Criteria criteria = example.createCriteria();
//		criteria.andEqualTo("userId", id);
//		List<AccountRole> roles = userRoleMapper.selectByExample(example);
//		
//		Example example2 = new Example(Role.class);
//		Criteria criteria2 = example2.createCriteria();
//		criteria2.andIn("id", roles);
//		return roleMapper.selectByExample(example2);
//	}
//
//	@Override
//	public Map<Integer, List<MenuVO>> getMenuByUserId(Integer id) {
//		Map<Integer, List<MenuVO>> map = new HashMap<>();
////		List<MenuVO> list = userMapper.getMenuByUAccountId(id);
////		if(!CollectionUtils.isEmpty(list)) {
////			map = menuService.getMneuTree(list);
////		}
//		return map;
//	}
//
//	@SuppressWarnings("rawtypes")
//	@Override
//	public Response addUser() {
//		return null;
//	}
//
//	@SuppressWarnings("rawtypes")
//	@Override
//	public Response updateUser() {
//		return null;
//	}
//
//	@SuppressWarnings("rawtypes")
//	@Override
//	public Response deleteUser() {
//		return null;
//	}

}
