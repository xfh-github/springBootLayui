package com.xing.layui.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;   //id
    private String usercode; //用户编码
    private String username; //用户名字
    private String userpassword; //用户密码
    private Integer gender; //性别
    private Date birthday; //生日
    private String phone; //手机号码
    private String address; //地址
    private Integer userrole; //创建者
    private Integer createdby; //创建时间
    private Date creationdate;//更新时间
}
