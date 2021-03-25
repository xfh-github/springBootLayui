package com.xing.layui.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class BillVo {
    private Integer id;
    private String billcode;
    private String productname;
    private String productdesc;
    private String productunit;
    private BigDecimal productcount;
    private BigDecimal totalprice;
    private Integer ispayment;
    private Integer createdby;
    private Date creationdate;
}
