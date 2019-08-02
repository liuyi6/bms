package com.luis.bms.resource.mapper;

import com.luis.bms.resource.dto.Account;
import org.springframework.stereotype.Repository;

/**
 * AccountMapper继承基类
 */
@Repository
public interface AccountMapper extends MyBatisBaseDao<Account, Integer> {
}