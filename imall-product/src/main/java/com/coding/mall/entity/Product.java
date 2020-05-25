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
@TableName("im_product")
@ApiModel(value="Product对象", description="")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    // 主键策略
    @ApiModelProperty(value = "自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "产品id")
    private String productId;

    @ApiModelProperty(value = "产品标题")
    private String productTitle;

    @ApiModelProperty(value = "产品访问路径")
    private String urlHandle;

    @ApiModelProperty(value = "产品主图src路径")
    private String firstImageSrc;

    @ApiModelProperty(value = "产品次图src路径")
    private String secondImageSrc;

    @ApiModelProperty(value = "原价")
    private BigDecimal originalPrice;

    @ApiModelProperty(value = "售价")
    private BigDecimal salePrice;

    @ApiModelProperty(value = "产品唯一编码")
    private String spu;

    @ApiModelProperty(value = "产品状态:0-下架,1-上架")
    private Integer status;

    @ApiModelProperty(value = "产品简短描述")
    private String shortDescription;

    @ApiModelProperty(value = "产品详细描述")
    private String detailDescription;

    @ApiModelProperty(value = "逻辑删除标识0-未删,1-删除")
    @TableLogic
    private Integer isDelete;

    @ApiModelProperty(value = "版本")
    @Version
    private Integer version;

    @ApiModelProperty(value = "创建员工")
    private String createEmp;

    @ApiModelProperty(value = "更新员工")
    private String updateEmp;

    // 时间戳
    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Integer createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Integer updateTime;


}
