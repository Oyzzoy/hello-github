package com.zoy.Service;

import com.zoy.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2023-06-17 16:59
 */

public interface AccountService {

    void transferMoney(String outAccount,String inAccount,Integer money);
}
