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
 * 栏目
 * </p>
 *
 * @author linhaibo
 * @since 2022-07-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TermTaxonomy对象", description="栏目")
public class TermTaxonomy implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "term_taxonomy_id", type = IdType.AUTO)
    private Long termTaxonomyId;

    @ApiModelProperty(value = "说明")
    private String description;

    @ApiModelProperty(value = "栏目名称")
    private String name;

    @ApiModelProperty(value = "父栏目id")
    private Long parentId;

    @ApiModelProperty(value = "创建人id")
    private Long createUserId;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "属性")
    private String attribute;


}
