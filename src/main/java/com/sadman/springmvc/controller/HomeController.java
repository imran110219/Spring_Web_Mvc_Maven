package com.sadman.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Sadman on 3/21/2018.
 */
@Controller
@RequestMapping({"/","/home"})
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String showHomePage() {
        return "home";
    }
}
