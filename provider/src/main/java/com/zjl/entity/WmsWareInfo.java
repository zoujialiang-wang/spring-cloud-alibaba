package com.zjl.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 仓库信息
 * </p>
 *
 * @author ZouJiaLiang
 * @since 2020-11-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="WmsWareInfo对象", description="仓库信息")
public class WmsWareInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "仓库名")
    private String name;

    @ApiModelProperty(value = "仓库地址")
    private String address;

    @ApiModelProperty(value = "区域编码")
    private String areacode;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private LocalDateTime createTime;


}
