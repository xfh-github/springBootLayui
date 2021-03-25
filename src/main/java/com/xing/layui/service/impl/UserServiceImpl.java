package com.xing.layui.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xing.layui.entity.User;
import com.xing.layui.mapper.UserMapper;
import com.xing.layui.service.UserService;
import com.xing.layui.vo.DataVo;
import com.xing.layui.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public DataVo<UserVo> findData1(Integer page, Integer limit) {
        DataVo dataVoUser = new DataVo<>();
        dataVoUser.setCode(0);
        dataVoUser.setMsg("");
        IPage<User> userIPage=new Page<>(page,limit);
        IPage<User> result = userMapper.selectPage(userIPage, null);
        dataVoUser.setCount(result.getTotal());

        List<User> userList = result.getRecords();
        List<UserVo> userVoList = new ArrayList<>();

        for (User user : userList) {
            UserVo userVo = new UserVo();
            BeanUtils.copyProperties(user,userVo);
            userVoList.add(userVo);
        }
        dataVoUser.setData(userVoList);
        return dataVoUser;
    }


}
