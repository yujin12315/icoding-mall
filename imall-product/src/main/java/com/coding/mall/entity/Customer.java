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
@TableName("im_customer")
@ApiModel(value="Customer对象", description="")
public class Customer implements Serializable {

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

    @ApiModelProperty(value = "0-女,1-男")
    private Integer gender;

    @ApiModelProperty(value = "邮件")
    private String email;

    @ApiModelProperty(value = "密码")
    private String password;

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
