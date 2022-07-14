package com.hepo.code.service.impl;

import com.hepo.code.entity.PostTagRelation;
import com.hepo.code.mapper.PostTagRelationMapper;
import com.hepo.code.service.IPostTagRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标签文章关系表 服务实现类
 * </p>
 *
 * @author linhaibo
 * @since 2022-07-14
 */
@Service
public class PostTagRelationServiceImpl extends ServiceImpl<PostTagRelationMapper, PostTagRelation> implements IPostTagRelationService {

}
