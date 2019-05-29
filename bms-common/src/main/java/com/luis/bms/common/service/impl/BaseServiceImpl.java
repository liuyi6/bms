package com.luis.bms.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.luis.bms.common.service.BaseService;
import com.luis.bms.common.utils.BaseMapper;

import tk.mybatis.mapper.entity.Example;

@Component
public class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
	private BaseMapper<T> baseMapper;
	
	@Override
	public int delete(T entity) {
		return baseMapper.delete(entity);
	}

	@Override
	public int deleteByExample(Example example) {
		return baseMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Object key) {
		return baseMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(T entity) {
		return baseMapper.insert(entity);
	}

	@Override
	public int insertList(List<T> entities) {
		if(CollectionUtils.isEmpty(entities)) {
			return 0;
		}
		return baseMapper.insertList(entities);
	}

	@Override
	public int update(T entity) {
		return baseMapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public int updateByExample(T entity, Example example) {
		return baseMapper.updateByExampleSelective(entity, example);
	}

	@Override
	public int selectCountByExample(Example example) {
		return baseMapper.selectCountByExample(example);
	}

	@Override
	public T selectByPrimaryKey(Object key) {
		return baseMapper.selectByPrimaryKey(key);
	}

	@Override
	public T selectOne(T entity) {
		return baseMapper.selectOne(entity);
	}

	@Override
	public List<T> selectAll() {
		return baseMapper.selectAll();
	}

	@Override
	public List<T> selectByExample(Example example) {
		return baseMapper.selectByExample(example);
	}

}
