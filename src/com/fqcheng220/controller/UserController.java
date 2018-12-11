package com.fqcheng220.controller;

import com.fqcheng220.bean.User;
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

    @RequestMapping(value = "/login1", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login1(@RequestBody String userName,
                               @RequestBody String pwd){
        System.out.println("UserController login:"+userName+","+pwd);
        return new CommonResult<String>().status(0).body("hello");
    }

    @RequestMapping(value = "/login2", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login2(@RequestBody User user){
        System.out.println("UserController login:"+user.mUserName+","+user.mPwd);
        return new CommonResult<String>().status(0).body("hello");
    }

    //406
    @RequestMapping(value = "/login3", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login3(String userName,
                               String pwd){
        System.out.println("UserController login:"+userName+","+pwd);
        return new CommonResult<String>().status(0).body("hello");
    }

    //406
    @RequestMapping(value = "/login4", method = RequestMethod.POST,produces = {"application/x-www-form-urlencoded"})
    @ResponseBody
    public CommonResult login4(String userName,
                               String pwd){
        System.out.println("UserController login:"+userName+","+pwd);
        return new CommonResult<String>().status(0).body("hello");
    }

}
