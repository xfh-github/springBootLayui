package com.xing.layui.vo;

import lombok.Data;

import java.util.List;

@Data
public class BarVo {
    private List<String> productName;
    private List<Integer> productCount;
}
