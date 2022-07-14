package com.hepo.code.service.impl;

import com.hepo.code.entity.Users;
import com.hepo.code.mapper.UsersMapper;
import com.hepo.code.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author linhaibo
 * @since 2022-07-14
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
