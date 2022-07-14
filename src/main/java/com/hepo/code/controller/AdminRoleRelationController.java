package com.hepo.code.controller;


import com.hepo.code.entity.AdminRoleRelation;
import com.hepo.code.service.IAdminRoleRelationService;
import com.hepo.code.service.impl.AdminRoleRelationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 后台用户和角色关系表 前端控制器
 * </p>
 *
 * @author linhaibo
 * @since 2022-07-14
 */
@RestController
@RequestMapping("/adminRoleRelation")
public class AdminRoleRelationController {


    @Autowired
    private IAdminRoleRelationService adminRoleRelationService;

    @RequestMapping("/hello")
    public String hello() {
        AdminRoleRelation adminRoleRelation = adminRoleRelationService.getById(1);

        if (adminRoleRelation != null) {
            return adminRoleRelation.toString();
        }else {
            return "找不到数据";
        }

    }
}

