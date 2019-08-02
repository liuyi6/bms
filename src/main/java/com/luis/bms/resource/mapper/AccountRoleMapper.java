package com.luis.bms.resource.mapper;

import com.luis.bms.resource.dto.ccountRole;
import org.springframework.stereotype.Repository;

/**
 * AccountRoleMapper继承基类
 */
@Repository
public interface AccountRoleMapper extends MyBatisBaseDao<ccountRole, Integer> {
}