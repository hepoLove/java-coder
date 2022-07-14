package com.hepo.code.service.impl;

import com.hepo.code.entity.Role;
import com.hepo.code.mapper.RoleMapper;
import com.hepo.code.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户角色表 服务实现类
 * </p>
 *
 * @author linhaibo
 * @since 2022-07-14
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
