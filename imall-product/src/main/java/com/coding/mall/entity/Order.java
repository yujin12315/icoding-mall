package com.coding.mall.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Coding
 * @since 2020-01-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("im_order")
@ApiModel(value="Order对象", description="")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "订单编号")
    private String orderSn;

    @ApiModelProperty(value = "用户邮箱")
    private String userEmail;

    @ApiModelProperty(value = "姓")
    private String firstName;

    @ApiModelProperty(value = "名")
    private String lastName;

    @ApiModelProperty(value = "国家")
    private String country;

    @ApiModelProperty(value = "省/州")
    private String province;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "公司")
    private String company;

    @ApiModelProperty(value = "详细地址1")
    private String address1;

    @ApiModelProperty(value = "详细地址2")
    private String address2;

    @ApiModelProperty(value = "电话")
    private String telphone;

    @ApiModelProperty(value = "邮编")
    private String zip;

    @ApiModelProperty(value = "购物车总价")
    private BigDecimal subtotalPrice;

    @ApiModelProperty(value = "物流费用")
    private BigDecimal shippingPrice;

    @ApiModelProperty(value = "订单总价")
    private BigDecimal totalPrice;

    @ApiModelProperty(value = "订单备注")
    private String memo;

    @ApiModelProperty(value = "逻辑删除标识0-未删,1-删除")
    @TableLogic
    private Integer isDelete;

    @ApiModelProperty(value = "版本")
    @Version
    private Integer version;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Integer createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Integer updateTime;


}
