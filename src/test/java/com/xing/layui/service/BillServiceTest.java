package com.xing.layui.service;

import com.xing.layui.vo.BillVo;
import com.xing.layui.vo.DataVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BillServiceTest {
    @Autowired
    private BillService service;

    @Test
    void test(){
        DataVo<BillVo> bill = service.findBill(1, 10);
        int i=0;
    }

}