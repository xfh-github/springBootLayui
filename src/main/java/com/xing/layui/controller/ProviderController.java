package com.xing.layui.controller;

import com.xing.layui.service.ProviderService;
import com.xing.layui.service.UserService;
import com.xing.layui.vo.BarVo;
import com.xing.layui.vo.DataVo;
import com.xing.layui.vo.PieVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
/*@CrossOrigin*/
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @RequestMapping("/list")
    @ResponseBody
    public DataVo list(Integer page,Integer limit){
        return providerService.findData(page,limit);
    }

    @GetMapping("/{url}")
    public String redirect(@PathVariable("url") String url){
        return url;
    }

    @RequestMapping("/barVo")
    @ResponseBody
    public BarVo getBarVo(){
        return providerService.getBarVo();
    }

    @RequestMapping("/pieVo")
    @ResponseBody
    public List<PieVo> getPieVo(){
        return providerService.getPieVo();
    }


}
