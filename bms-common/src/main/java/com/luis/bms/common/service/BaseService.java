package com.luis.bms.common.service;

import java.util.List;

import tk.mybatis.mapper.entity.Example;

/**  
* @ClassName: BaseService  
* @Description: 通用service
* @author luis  
* @date 2019年5月29日  
*/
public interface BaseService<T> {
	/**  
	* @Title: delete  
	* @Description: 根据对象删除 
	* @param @param entity
	* @param @return
	* @return int  
	* @throws  
	*/  
	public int delete(T entity);
	
	/**  
	* @Title: deleteByExample  
	* @Description: 根据条件删除 
	* @param @param example
	* @param @return
	* @return int  
	* @throws  
	*/  
	public int deleteByExample(Example example);
	
	/**  
	* @Title: deleteByPrimaryKey  
	* @Description: 根据主键删除 
	* @param @param key
	* @param @return
	* @return int  
	* @throws  
	*/  
	public int deleteByPrimaryKey(Object key);
	
	/**  
	* @Title: insert  
	* @Description: 单个插入 
	* @param @param entity
	* @param @return
	* @return int  
	* @throws  
	*/  
	public int insert(T entity);
	
	/**  
	* @Title: insertList  
	* @Description: 批量插入 
	* @param @param entities
	* @param @return
	* @return int  
	* @throws  
	*/  
	public int insertList(List<T> entities);
	
	/**  
	* @Title: update  
	* @Description: 更新 
	* @param @param entity
	* @param @return
	* @return int  
	* @throws  
	*/  
	public int update(T entity);
	
	/**  
	* @Title: updateByExample  
	* @Description: 根据条件更新 
	* @param @param entity
	* @param @param example
	* @param @return
	* @return int  
	* @throws  
	*/  
	public int updateByExample(T entity,Example example);
	
	/**  
	* @Title: selectCountByExample  
	* @Description: 根据条件统计数量 
	* @param @param example
	* @param @return
	* @return int  
	* @throws  
	*/  
	public int selectCountByExample(Example example);
	
	/**  
	* @Title: selectByPrimaryKey  
	* @Description: 根据逐渐选择 
	* @param @param key
	* @param @return
	* @return T  
	* @throws  
	*/  
	public T selectByPrimaryKey(Object key);
	
	/**  
	* @Title: selectOne  
	* @Description: 根据实体查找 
	* @param @param entity
	* @param @return
	* @return T  
	* @throws  
	*/  
	public T selectOne(T entity);
	
	/**  
	* @Title: selectAll  
	* @Description: 查找所有 
	* @param @return
	* @return List<T>  
	* @throws  
	*/  
	public List<T> selectAll();
	
	/**  
	* @Title: selectByExample  
	* @Description: 根据条件查找 
	* @param @param example
	* @param @return
	* @return List<T>  
	* @throws  
	*/  
	public List<T> selectByExample(Example example);
	
}
