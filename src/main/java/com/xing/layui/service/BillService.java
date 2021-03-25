package com.xing.layui.service;

import com.xing.layui.vo.BillVo;
import com.xing.layui.vo.DataVo;

public interface BillService {
    public DataVo<BillVo> findBill(Integer page,Integer limit);
}
