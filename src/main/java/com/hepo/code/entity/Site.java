package com.hepo.code.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 站点配置
 * </p>
 *
 * @author linhaibo
 * @since 2022-07-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Site对象", description="站点配置")
public class Site implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "site_id")
    @TableId(value = "site_id", type = IdType.AUTO)
    private Long siteId;

    @ApiModelProperty(value = "名称")
    private String siteName;

    @ApiModelProperty(value = "关键字")
    private String keywords;

    @ApiModelProperty(value = "介绍")
    private String siteDesc;

    @ApiModelProperty(value = "属性")
    private String attribute;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
