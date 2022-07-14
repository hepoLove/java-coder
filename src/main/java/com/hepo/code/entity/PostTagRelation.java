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
 * 标签文章关系表
 * </p>
 *
 * @author linhaibo
 * @since 2022-07-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="PostTagRelation对象", description="标签文章关系表")
public class PostTagRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "对应文章ID")
    @TableId(value = "post_id", type = IdType.AUTO)
    private Long postId;

    @ApiModelProperty(value = "标签ID")
    private Long postTagId;

    @ApiModelProperty(value = "排序")
    private Integer termOrder;


}
