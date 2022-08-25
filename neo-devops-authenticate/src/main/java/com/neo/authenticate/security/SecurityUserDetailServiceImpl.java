package com.neo.authenticate.security;

import com.alibaba.fastjson.JSON;
import com.neo.authenticate.entity.Permission;
import com.neo.authenticate.service.PermissionService;
import com.neo.authenticate.service.UserService;
import com.neo.common.entity.NeoUser;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author neo-w7
 * Date: 2022-08-25
 * Description:
 */
@Service
@Slf4j
public class SecurityUserDetailServiceImpl implements UserDetailsService {


    @Resource
    private UserService userService;

    @Resource
    private PermissionService permissionService;


    @Override
    public UserDetails loadUserByUsername(String username) {

        NeoUser user = userService.getUserByUsername(username);
        if (user == null) {
            return null;
        }
        // 获取权限
        List<Permission> permissions = permissionService.getPermissionsByUserId(user.getId());
        List<String> codes = permissions.stream().map(Permission::getCode).collect(Collectors.toList());
        String[] authorities = null;
        if (CollectionUtils.isNotEmpty(codes)) {
            authorities = new String[codes.size()];
            codes.toArray(authorities);
        }
        //身份令牌
        String principal = JSON.toJSONString(user);
        assert authorities != null;
        return User.withUsername(principal).password(user.getPassword()).authorities(authorities).build();
    }
}

