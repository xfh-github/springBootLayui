package com.xing.layui.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xing.layui.entity.Provider;
import com.xing.layui.mapper.ProviderMapper;
import com.xing.layui.service.ProviderService;
import com.xing.layui.vo.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    private ProviderMapper providerMapper;

    @Override
    public DataVo<ProviderVo> findData(Integer page,Integer limit) {
        DataVo dataVo=new DataVo();
        dataVo.setCode(0);
        dataVo.setMsg("");
        IPage<Provider> providerIPage = new Page<>(page, limit);
        IPage<Provider> result = providerMapper.selectPage(providerIPage, null);
        dataVo.setCount(result.getTotal());
        List<Provider> providerList = result.getRecords();
        List<ProviderVo> providerVoList=new ArrayList<>();

        for (Provider provider : providerList) {
            ProviderVo providerVo = new ProviderVo();
            BeanUtils.copyProperties(provider,providerVo);
            providerVoList.add(providerVo);
        }


        dataVo.setData(providerVoList);


        return dataVo;
    }

    @Override
    public BarVo getBarVo() {
        List<ProviderBarVo> providerBarVo = providerMapper.findAllProviderBarVo();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        for (ProviderBarVo barVo : providerBarVo) {
            name.add(barVo.getProductName());
            values.add(barVo.getProductCount());
        }
        BarVo vo = new BarVo();
        vo.setProductName(name);
        vo.setProductCount(values);
        return vo;
    }

    @Override
    public List<PieVo> getPieVo() {
        List<ProviderBarVo> list = providerMapper.findAllProviderBarVo();
        List<PieVo> pieVoList =list.stream()
                .map(e ->new PieVo(
                        e.getProductCount(),
                        e.getProductName()
                )).collect(Collectors.toList());
        return pieVoList;
    }
}
