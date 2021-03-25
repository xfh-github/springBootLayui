package com.xing.layui.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xing.layui.entity.Bill;
import com.xing.layui.mapper.BillMapper;
import com.xing.layui.service.BillService;
import com.xing.layui.vo.BillVo;
import com.xing.layui.vo.DataVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;
    @Override
    public DataVo<BillVo> findBill(Integer page, Integer limit) {
        DataVo dataVo = new DataVo<>();
        dataVo.setCode(0);
        dataVo.setMsg("");
        IPage<Bill> billIPage=new Page<>(page,limit);
        IPage<Bill> result = billMapper.selectPage(billIPage, null);
        dataVo.setCount(result.getTotal());

        List<Bill> billList = result.getRecords();
        List<BillVo> billVoList = new ArrayList<>();

        for (Bill bill : billList) {
            BillVo billVo = new BillVo();
            BeanUtils.copyProperties(bill,billVo);
            billVoList.add(billVo);
        }
        dataVo.setData(billVoList);
        return dataVo;
    }
}
