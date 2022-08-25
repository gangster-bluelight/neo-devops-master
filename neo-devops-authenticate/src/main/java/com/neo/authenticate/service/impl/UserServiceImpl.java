package com.neo.authenticate.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neo.authenticate.mapper.UserMapper;
import com.neo.authenticate.service.UserService;
import com.neo.common.entity.NeoUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author neo-w7
 * Date: 2022-08-25
 * Description:
 */
@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, NeoUser> implements UserService {
    @Override
    public NeoUser getUserByUsername(String username) {
        QueryWrapper<NeoUser> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        return baseMapper.selectOne(wrapper);
    }
}
