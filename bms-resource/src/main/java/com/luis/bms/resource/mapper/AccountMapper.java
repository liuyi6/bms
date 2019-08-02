package com.luis.bms.resource.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.luis.bms.common.utils.BaseMapper;
import com.luis.bms.resource.dao.vo.MenuVO;
import com.luis.bms.resource.dto.Account;

/**  
* @ClassName: AccountMapper  
* @Description: 账户mapper接口  
* @author luis  
* @date 2019年5月18日  
*/
@Repository
public interface AccountMapper extends BaseMapper<Account> {

//	List<MenuVO> getMenuByUAccountId(Integer id);
	

}
