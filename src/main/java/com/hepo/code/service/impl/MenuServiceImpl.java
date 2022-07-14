package com.hepo.code.service.impl;

import com.hepo.code.entity.Menu;
import com.hepo.code.mapper.MenuMapper;
import com.hepo.code.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台菜单表 服务实现类
 * </p>
 *
 * @author linhaibo
 * @since 2022-07-14
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
