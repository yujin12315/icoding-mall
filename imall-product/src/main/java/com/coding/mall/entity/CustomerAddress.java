package com.coding.mall.entity;

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
@TableName("im_customer_address")
@ApiModel(value="CustomerAddress对象", description="")
public class CustomerAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "客户id")
    private String customerId;

    @ApiModelProperty(value = "姓")
    private String firstName;

    @ApiModelProperty(value = "名")
    private String lastName;

    @ApiModelProperty(value = "邮件")
    private String email;

    @ApiModelProperty(value = "公司名")
    private String companyName;

    @ApiModelProperty(value = "国家")
    private String country;

    @ApiModelProperty(value = "省,州")
    private String province;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "邮编")
    private String zip;

    @ApiModelProperty(value = "电话")
    private String telphone;

    @ApiModelProperty(value = "详细地址1")
    private String address1;

    @ApiModelProperty(value = "补充地址2")
    private String address2;

    @ApiModelProperty(value = "0-非默认,1-默认地址")
    private Integer defaultType;

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
