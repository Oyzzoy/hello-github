package com.zoy.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author shkstart
 * @create 2023-06-16 22:30
 */
@Mapper
public interface AccountMapper {
    //+钱
    @Update("update tb_account set money=money+#{money} where account_name=#{accountName}")
    public void incrMoney(@Param("accountName") String accountName,@Param("money") Integer money);

    //-钱
    @Update("update tb_account set money=money-#{money} where account_name=#{accountName}")
    public void decrMoney(@Param("accountName") String accountName,@Param("money") Integer money);
}
