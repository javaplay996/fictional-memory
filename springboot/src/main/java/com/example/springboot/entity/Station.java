package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import cn.hutool.core.annotation.Alias;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2023-03-12
 */
@Getter
@Setter
@ApiModel(value = "Station对象", description = "")
public class Station implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("加油站站点名称")
    @Alias("加油站站点名称")
    private String name;

    @ApiModelProperty("地址")
    @Alias("地址")
    private String address;

    @ApiModelProperty("备注")
    @Alias("备注")
    private String remark;


}
