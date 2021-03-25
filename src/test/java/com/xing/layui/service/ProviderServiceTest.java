package com.xing.layui.service;

import com.xing.layui.vo.BarVo;
import com.xing.layui.vo.DataVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProviderServiceTest {

    @Autowired
    private ProviderService service;


    @Test
    void test(){
        BarVo barVo = service.getBarVo();
        int i=0;

    }
}