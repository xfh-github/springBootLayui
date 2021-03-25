package com.xing.layui.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xing.layui.entity.Provider;
import com.xing.layui.vo.ProviderBarVo;
import com.xing.layui.vo.ProviderVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProviderMapper extends BaseMapper<Provider> {
    @Select("select productName,productCount from smbms_pie")
    public List<ProviderBarVo> findAllProviderBarVo();
}
