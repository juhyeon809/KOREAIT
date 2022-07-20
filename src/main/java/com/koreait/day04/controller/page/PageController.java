package com.koreait.day04.controller.page;

import com.koreait.day04.service.AdminMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pages")   //http://localhost:9090/pages
public class PageController {

    @Autowired //주입
    private AdminMenuService adminMenuService;

    @RequestMapping(path={""})
    public ModelAndView index(){
        //페이지에서 메소드 불러올 때 .addObject() 사용
        return new ModelAndView("/pages/index")
                .addObject("menuList", adminMenuService.getAdminMenu())
                .addObject("code", "main");
    }

    @RequestMapping("/user") //http://localhost:9090/pages/user
    public ModelAndView user(){
        return new ModelAndView("/pages/user")
                .addObject("menuList", adminMenuService.getAdminMenu())
                .addObject("code", "main");
//                .addObject("user", index());
    }
    @RequestMapping("/user-regist")    // http://localhost:9090/pages/user-regist
    public ModelAndView userRegist(){
        return new ModelAndView("/pages/user_regist")
                .addObject("menuList", adminMenuService.getAdminMenu())
                .addObject("code", "main");
    }

}
