package com.xing.layui.controller;

import com.xing.layui.service.BillService;
import com.xing.layui.service.UserService;
import com.xing.layui.vo.BillVo;
import com.xing.layui.vo.DataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BillController {

    @Autowired
    private BillService billService;

    @RequestMapping("/billlist")
    @ResponseBody
    public DataVo findBill(Integer page,Integer limit){

        return billService.findBill(page, limit);
    }




}
