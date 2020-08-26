package com.myTest.Test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping
public class MyController {
    @GetMapping(path = "/")
    public ModelAndView index(ModelAndView modelAndView){


        modelAndView.setViewName("index");
        return modelAndView;
    }
}
