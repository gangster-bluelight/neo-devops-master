package com.neo.authenticate.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neo.authenticate.entity.Permission;

import java.util.List;

/**
 * @author neo-w7
 * Date: 2022-08-25
 * Description:
 */
public interface PermissionService extends IService<Permission> {
    List<Permission> getPermissionsByUserId(Integer userId);
}
