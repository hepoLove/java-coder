package com.hepo.code.service.impl;

import com.hepo.code.entity.Comments;
import com.hepo.code.mapper.CommentsMapper;
import com.hepo.code.service.ICommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论表 服务实现类
 * </p>
 *
 * @author linhaibo
 * @since 2022-07-14
 */
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements ICommentsService {

}
