package com.neo.authenticate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neo.authenticate.entity.Permission;
import com.neo.authenticate.mapper.PermissionMapper;
import com.neo.authenticate.service.PermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author neo-w7
 * Date: 2022-08-25
 * Description:
 */
@Slf4j
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {
    @Override
    public List<Permission> getPermissionsByUserId(Integer userId){

        return baseMapper.selectPermissionsByUserId(userId);
    }
}
