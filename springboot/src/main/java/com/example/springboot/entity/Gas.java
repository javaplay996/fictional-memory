package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
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
 * @since 2023-03-13
 */
@Getter
@Setter
@ApiModel(value = "Gas对象", description = "")
public class Gas implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("汽油名称")
    @Alias("汽油名称")
    private String name;

    @ApiModelProperty("类型")
    @Alias("类型")
    private String type;

    @ApiModelProperty("油价")
    @Alias("油价")
    private BigDecimal price;


}
