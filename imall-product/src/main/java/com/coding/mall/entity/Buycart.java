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
@TableName("im_buycart")
@ApiModel(value="Buycart对象", description="")
public class Buycart implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "登录用户id")
    private String customerId;

    @ApiModelProperty(value = "未登录cookie id")
    private String buyId;

    @ApiModelProperty(value = "登录状态0-未登录,1-登录")
    private Integer loginStatus;

    @ApiModelProperty(value = "产品id")
    private String productId;

    @ApiModelProperty(value = "产品唯一编码")
    private String spu;

    @ApiModelProperty(value = "产品原价")
    private BigDecimal originalPrice;

    @ApiModelProperty(value = "产品售价")
    private BigDecimal salePrice;

    @ApiModelProperty(value = "销售数量")
    private Integer saleQty;

    @ApiModelProperty(value = "销售总价")
    private BigDecimal saleTotalPrice;

    @ApiModelProperty(value = "属性id")
    private Integer variantsId;

    @ApiModelProperty(value = "属性标题")
    private String variantsTitle;

    @ApiModelProperty(value = "属性唯一编码")
    private String sku;

    @ApiModelProperty(value = "属性图片src路径")
    private String imageSrc;

    @ApiModelProperty(value = "属性重量")
    private Integer variantsWeight;

    @ApiModelProperty(value = "产品url")
    private String productHandle;

    @ApiModelProperty(value = "产品标题")
    private String productTitle;

    @ApiModelProperty(value = "集合id")
    private String collectionId;

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
