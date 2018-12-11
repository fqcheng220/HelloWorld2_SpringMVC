package com.fqcheng220.controller;

import com.fqcheng220.result.CommonResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @RequestMapping(value = "/login", method = RequestMethod.POST,produces = {"application/x-www-form-urlencoded;charset=UTF-8"},consumes = {"application/x-www-form-urlencoded"})
    @ResponseBody
    public CommonResult login(@RequestParam String userName,
                              @RequestParam String pwd){
        System.out.println("UserController login:"+userName+","+pwd);
        return new CommonResult<String>().status(0).body("hello");
    }
}
