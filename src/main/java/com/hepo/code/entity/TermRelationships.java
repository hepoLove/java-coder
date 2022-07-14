package com.hepo.code.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 文章栏目关系表
 * </p>
 *
 * @author linhaibo
 * @since 2022-07-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TermRelationships对象", description="文章栏目关系表")
public class TermRelationships implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "对应文章ID/链接ID")
    @TableId(value = "term_relationships_id", type = IdType.AUTO)
    private Long termRelationshipsId;

    @ApiModelProperty(value = "栏目ID")
    private Long termTaxonomyId;

    @ApiModelProperty(value = "排序")
    private Integer termOrder;

    @ApiModelProperty(value = "类型,0:内容,1:链接")
    private Integer type;


}
