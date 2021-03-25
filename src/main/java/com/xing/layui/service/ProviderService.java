package com.xing.layui.service;

import com.xing.layui.vo.BarVo;
import com.xing.layui.vo.DataVo;
import com.xing.layui.vo.PieVo;
import com.xing.layui.vo.ProviderVo;

import java.util.List;

public interface ProviderService {

    public DataVo<ProviderVo> findData(Integer page,Integer limit);
    public BarVo getBarVo();
    public List<PieVo> getPieVo();
}
