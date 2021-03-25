package com.xing.layui.service;

import com.xing.layui.vo.DataVo;
import com.xing.layui.vo.UserVo;

public interface UserService {

    public DataVo<UserVo> findData1(Integer page,Integer limit);


}
