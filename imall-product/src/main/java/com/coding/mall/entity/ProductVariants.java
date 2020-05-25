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
@TableName("im_product_variants")
@ApiModel(value="ProductVariants对象", description="")
public class ProductVariants implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "属性id")
    private String variantsId;

    @ApiModelProperty(value = "属性名称,多个属性值用/隔开")
    private String variantsTitle;

    @ApiModelProperty(value = "属性唯一编码")
    private String sku;

    @ApiModelProperty(value = "原价")
    private BigDecimal originalPrice;

    @ApiModelProperty(value = "售价")
    private BigDecimal salePrice;

    @ApiModelProperty(value = "重量单位g")
    private Integer variantsWeight;

    @ApiModelProperty(value = "属性名1")
    private String optionName1;

    @ApiModelProperty(value = "属性名2")
    private String optionName2;

    @ApiModelProperty(value = "属性名3")
    private String optionName3;

    @ApiModelProperty(value = "属性值1")
    private String optionValue1;

    @ApiModelProperty(value = "属性值2")
    private String optionValue2;

    @ApiModelProperty(value = "属性值3")
    private String optionValue3;

    @ApiModelProperty(value = "产品id")
    private String productId;

    @ApiModelProperty(value = "属性图片src路径")
    private String imageSrc;

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

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Integer createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Integer updateTime;


}
