package com.luis.bms.resource.service;

import java.util.List;
import java.util.Map;

import com.luis.bms.resource.dao.vo.MenuVO;

/**  
* @ClassName: MenuService  
* @Description: 菜单业务接口  
* @author luis  
* @date 2019年5月18日  
*/
public interface MenuService {
	/**  
	* @Title: getMneuTree  
	* @Description: 返回树形菜单
	* @param @param list
	* @param @return
	* @return Map<Integer,Menu>  
	* @throws  
	*/  
	Map<Integer, List<MenuVO>> getMneuTree(List<MenuVO> list);
}
