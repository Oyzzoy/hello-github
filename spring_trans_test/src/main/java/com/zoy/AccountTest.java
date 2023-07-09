package com.zoy;

import com.zoy.Service.AccountService;
import com.zoy.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2023-06-17 21:16
 */
public class AccountTest {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = app.getBean(AccountService.class);
        accountService.transferMoney("tom","lucy",500);
    }
}
