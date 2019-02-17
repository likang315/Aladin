package com.aladin.controller.product;

import com.aladin.service.product.IndexPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexPageController {

    @Autowired
    IndexPageService indexPageService;

    @RequestMapping("/index")
    public void indexPage(ModelAndView modelAndView){


    }



}
