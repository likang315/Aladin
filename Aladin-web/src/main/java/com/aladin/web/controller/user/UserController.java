package com.aladin.web.controller.user;

import com.aladin.pojo.user.User;
import com.aladin.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Resource
    private UserService userService ;

    @RequestMapping("/toregist.htm")
    public String toregist()
    {
        return "regist";
    }
    @RequestMapping("/tologin.thm")
    public String tologin(){
        return "login" ;
    }

    @RequestMapping(value = "/regist",method = RequestMethod.GET)
    public String regist(User user , Model model){
        userService.addUser(user);
        model.addAttribute(user) ;
        return "ok" ;

    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(User user , Model model){
        user = userService.checkLogin(user.getCounId(),user.getPwd());
        if(user!=null){
            model.addAttribute(user);
            return "welcome";
        }
        return "fail" ;
    }

}