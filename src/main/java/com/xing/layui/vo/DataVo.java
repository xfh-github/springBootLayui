package com.xing.layui.vo;

import lombok.Data;

import java.util.List;

@Data
public class DataVo<T> {
    private Integer code;
    private String msg;
    private long count;
    private List<T> data;


}
