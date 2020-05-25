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
@TableName("im_comments")
@ApiModel(value="Comments对象", description="")
public class Comments implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "客户id,展示姓名要脱敏")
    private String customerId;

    @ApiModelProperty(value = "商品id")
    private String productId;

    @ApiModelProperty(value = "商品title")
    private String productTitle;

    @ApiModelProperty(value = "商品属性id")
    private String variantsId;

    @ApiModelProperty(value = "商品属性标题")
    private String variantsTitle;

    @ApiModelProperty(value = "评价星级1-5星")
    private Integer commentLevel;

    @ApiModelProperty(value = "评价内容")
    private String content;

    @ApiModelProperty(value = "是否删除0-未删,1-删除")
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
