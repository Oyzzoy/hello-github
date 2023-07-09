package com.zoy.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart
 * @create 2023-06-20 21:11
 */


@Controller
public class QuickController {

    @RequestMapping("/show")
    public String show(){
        System.out.println("加载完成");
        return "/index.jsp";

    }
}
