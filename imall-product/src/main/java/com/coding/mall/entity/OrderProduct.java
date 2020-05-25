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
@TableName("im_order_product")
@ApiModel(value="OrderProduct对象", description="")
public class OrderProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "订单编号")
    private String orderSn;

    @ApiModelProperty(value = "产品id")
    private String productId;

    @ApiModelProperty(value = "产品唯一编码")
    private String spu;

    @ApiModelProperty(value = "产品标题")
    private String productTitle;

    @ApiModelProperty(value = "属性id")
    private String variantsId;

    @ApiModelProperty(value = "属性唯一编码")
    private String sku;

    @ApiModelProperty(value = "属性标题")
    private String variantsTitle;

    @ApiModelProperty(value = "购买数量")
    private Integer saleQty;

    @ApiModelProperty(value = "产品单价")
    private BigDecimal salePrice;

    @ApiModelProperty(value = "产品总价")
    private BigDecimal saleTotalPrice;

    @ApiModelProperty(value = "属性商品src路径")
    private String imageSrc;

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
