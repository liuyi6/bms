package com.luis.bms.resource.mapper;

import org.springframework.stereotype.Repository;

import com.luis.bms.common.utils.BaseMapper;
import com.luis.bms.resource.dto.Dictionary;

/**  
* @ClassName: DictionaryMapper  
* @Description: 字典mapper接口  
* @author luis  
* @date 2019年5月18日  
*/
@Repository
public interface DictionaryMapper extends BaseMapper<Dictionary> {
}