package com.xing.layui.mapper;

import com.xing.layui.vo.ProviderBarVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProviderMapperTest {

    @Autowired
    private ProviderMapper mapper;

    @Test
    void test(){
        mapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void test2(){
        List<ProviderBarVo> list = mapper.findAllProviderBarVo();
        int i=0;
    }

}