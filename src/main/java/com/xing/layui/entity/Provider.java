package com.xing.layui.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Provider {
	
	private Integer id;   //id
	private String procode; //供应商编码
	private String proname; //供应商名称
	private String prodesc; //供应商描述
	private String procontact; //供应商联系人
	private String prophone; //供应商电话
	private String proaddress; //供应商地址
	private String profax; //供应商传真
	private Integer createdby; //创建者
	private Date creationdate; //创建时间
	private Date modifydate;//更新时间
	private Integer modifyby; //更新者



	
}
