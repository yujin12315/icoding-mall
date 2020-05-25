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
@TableName("im_collection")
@ApiModel(value="Collection对象", description="")
public class Collection implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "集合id")
    private String collectionId;

    @ApiModelProperty(value = "集合路径")
    private String urlHandle;

    @ApiModelProperty(value = "集合状态:0-下架,1-上架")
    private Integer status;

    @ApiModelProperty(value = "一级目录默认为0,写入父极collection_id")
    private String parentId;

    @ApiModelProperty(value = "集合标题")
    private String title;

    @ApiModelProperty(value = "集合封面src路径")
    private String imageSrc;

    @ApiModelProperty(value = "集合描述")
    private String description;

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
