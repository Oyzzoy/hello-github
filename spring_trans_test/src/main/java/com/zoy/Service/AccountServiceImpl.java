package com.zoy.Service;

import com.zoy.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author shkstart
 * @create 2023-06-17 17:02
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountMapper accountMapper;
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,timeout = 4)
    public void transferMoney(String outAccount, String inAccount, Integer money) {
        accountMapper.decrMoney(inAccount,money);
        int i=1/0;
        accountMapper.incrMoney(outAccount,money);
    }
}
