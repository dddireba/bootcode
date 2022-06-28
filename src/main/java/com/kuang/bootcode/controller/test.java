package com.kuang.bootcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class test {
    @GetMapping("/user")
//@RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUser(){
        return "GET-张三";
    }


    @PostMapping("/user")
//@RequestMapping(value = "/user",method = RequestMethod.POST)
    public String saveUser(HttpServletRequest request){
        request.setAttribute("aaa","666");
        return "forward:/test1";
//        return "POST-张三";
    }

    @ResponseBody
    @RequestMapping("/test1")
    public String test1(HttpServletRequest request){
        String aaa = (String) request.getAttribute("aaa");

        return aaa;
    }


//    @PutMapping("/user")
@RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String putUser(){
        return "PUT-张三";
    }

//    @DeleteMapping("/user")
@RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "DELETE-张三";
    }

}
