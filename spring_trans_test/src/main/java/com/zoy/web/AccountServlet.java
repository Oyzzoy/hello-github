package com.zoy.web;

import com.zoy.Service.AccountService;
import com.zoy.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author shkstart
 * @create 2023-06-18 22:30
 */
@WebServlet(urlPatterns = "/accountServlet")
public class AccountServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        //web层调用service层，获取AccountService
                ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = app.getBean(AccountService.class);
        accountService.transferMoney("tom","lucy",500);

    }
}
