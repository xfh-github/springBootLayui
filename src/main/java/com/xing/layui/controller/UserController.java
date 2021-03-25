package com.xing.layui.controller;

import com.xing.layui.service.UserService;
import com.xing.layui.vo.DataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/userlist")
    @ResponseBody
    public DataVo list1(Integer page, Integer limit){
        return userService.findData1(page, limit);
    }



}
