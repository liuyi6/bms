package com.luis.bms.resource.service;

import java.util.List;

import com.luis.bms.common.response.PageResponse;
import com.luis.bms.common.response.Response;
import com.luis.bms.resource.dao.request.AddDictionaryRequet;
import com.luis.bms.resource.dao.request.PageDictionaryRequest;
import com.luis.bms.resource.dao.request.UpdateDictionaryRequet;
import com.luis.bms.resource.dto.Dictionary;

/**  
* @ClassName: DictionaryService  
* @Description: 字典service类
* @author luis  
* @date 2019年5月18日  
*/
public interface DictionaryService {
	
	/**  
	* @Title: listDictionary  
	* @Description: 分页查询字典数据
	* @param @param request
	* @param @return
	* @return List<Dictionary>  
	* @throws  
	*/  
	PageResponse<Dictionary> listDictionary(PageDictionaryRequest request);
	
	/**  
	* @Title: getDictionaryByType  
	* @Description: 根据类型获取字典数据
	* @param @param tyepe
	* @param @return
	* @return List<Dictionary>  
	* @throws  
	*/  
	List<Dictionary> getDictionaryByType(String type);
	
	/**  
	* @Title: addDictionary  
	* @Description: 新增字典
	* @param @param request
	* @return void  
	* @throws  
	*/  
	@SuppressWarnings("rawtypes")
	Response addDictionary(AddDictionaryRequet request);
	
	/**  
	* @Title: updateDictionary  
	* @Description: 更新字典
	* @param @param requet
	* @return void  
	* @throws  
	*/  
	@SuppressWarnings("rawtypes")
	Response updateDictionary(UpdateDictionaryRequet request);
	
	/**  
	* @Title: deleteDictionary  
	* @Description: 删除字典
	* @param @param ids
	* @return void  
	* @throws  
	*/  
	@SuppressWarnings("rawtypes")
	Response deleteDictionary(Integer ids);
	
}
