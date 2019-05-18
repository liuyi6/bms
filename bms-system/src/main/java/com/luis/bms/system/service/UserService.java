package com.luis.bms.system.service;

import java.util.List;
import java.util.Map;

import com.luis.bms.common.request.PageRequest;
import com.luis.bms.common.response.PageResponse;
import com.luis.bms.common.response.Response;
import com.luis.bms.system.dao.vo.MenuVO;
import com.luis.bms.system.dto.Role;
import com.luis.bms.system.dto.User;

/**  
* @ClassName: UserService  
* @Description: 用户业务接口  
* @author luis  
* @date 2019年5月18日  
*/
public interface UserService {
	
	/**  
	* @Title: listUser  
	* @Description: 分页查询用户 
	* @param @param request
	* @param @return
	* @return PageResponse<User>  
	* @throws  
	*/  
	PageResponse<User> listUser(PageRequest request);
	
	/**  
	* @Title: getUserBuUserById  
	* @Description: 根据Id查询用户 
	* @param @param id
	* @param @return
	* @return User  
	* @throws  
	*/  
	User getUserById(Integer id);
	
	/**  
	* @Title: getRolesById  
	* @Description: 根据用户Id查询所属角色 
	* @param @param id
	* @param @return
	* @return List<Role>  
	* @throws  
	*/  
	List<Role> getRolesByUserId(Integer id);
	
	/**  
	* @Title: getMenuByUserId  
	* @Description: 根据id返回菜单 
	* @param @param id
	* @param @return
	* @return Map<Integer,List<Menu>>  
	* @throws  
	*/  
	Map<Integer, List<MenuVO>> getMenuByUserId(Integer id);
	
	/**  
	* @Title: addUser  
	* @Description: 新增 
	* @param @return
	* @return Response  
	* @throws  
	*/  
	@SuppressWarnings("rawtypes")
	Response addUser();
	
	/**  
	* @Title: updateUser  
	* @Description: 修改 
	* @param @return
	* @return Response  
	* @throws  
	*/  
	@SuppressWarnings("rawtypes")
	Response updateUser();
	
	/**  
	* @Title: deleteUser  
	* @Description: 删除 
	* @param @return
	* @return Response  
	* @throws  
	*/  
	@SuppressWarnings("rawtypes")
	Response deleteUser();
	

}
