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
@TableName("im_carousel")
@ApiModel(value="Carousel对象", description="")
public class Carousel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "首页轮播图路径")
    private String imageSrc;

    @ApiModelProperty(value = "跳转路径,产品,集合,专题页")
    private String urlHandle;

    @ApiModelProperty(value = "轮播类型1-产品,2-集合,3-专题页")
    private Integer type;

    @ApiModelProperty(value = "轮播顺序")
    private Integer sort;

    @ApiModelProperty(value = "是否展示0-不展示,1-展示")
    private Integer isShow;

    @ApiModelProperty(value = "是否删除0-未删,1-删除")
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
