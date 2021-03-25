package com.xing.layui.service;

import com.xing.layui.vo.BarVo;
import com.xing.layui.vo.DataVo;
import com.xing.layui.vo.UserVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService service;


    @Test
    void test(){
        DataVo<UserVo> data1 = service.findData1(1, 10);
        int i=0;

    }

}