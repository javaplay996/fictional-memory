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
 * @since 2023-03-12
 */
@Getter
@Setter
@ApiModel(value = "Addgas对象", description = "")
public class Addgas implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户名称")
    @Alias("用户名称")
    private String username;

    @ApiModelProperty("花费")
    @Alias("花费")
    private BigDecimal cost;

    @ApiModelProperty("折扣价格")
    @Alias("折扣价格")
    private BigDecimal discountcost;

    @ApiModelProperty("汽油名称")
    @Alias("汽油名称")
    private String gasname;

    @ApiModelProperty("用户id")
    @Alias("用户id")
    private Integer userid;


}
