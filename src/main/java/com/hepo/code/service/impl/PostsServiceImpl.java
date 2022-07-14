package com.hepo.code.service.impl;

import com.hepo.code.entity.Posts;
import com.hepo.code.mapper.PostsMapper;
import com.hepo.code.service.IPostsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章 服务实现类
 * </p>
 *
 * @author linhaibo
 * @since 2022-07-14
 */
@Service
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts> implements IPostsService {

}
