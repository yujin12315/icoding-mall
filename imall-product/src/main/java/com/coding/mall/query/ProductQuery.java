package com.coding.mall.query;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


// VO  视图层对象！
@ApiModel(value = "Product查询对象",description = "产品查询对象封装")
@Data
public class ProductQuery {

    //产品标题
    @ApiModelProperty(value = "产品标题")
    private String productTitle;

    //产品状态，上架，下架
    @ApiModelProperty(value = "产品状态:0-下架,1-上架")
    private Integer status;

    //开始时间
    @ApiModelProperty(value = "查询开始时间",example = "2020-01-08 10:10:10")
    private String begin;

    //结束时间
    @ApiModelProperty(value = "查询结束时间",example = "2020-01-08 10:10:10")
    private String end;


}
