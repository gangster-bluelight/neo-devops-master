package com.neo.authenticate.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neo.common.entity.NeoUser;

/**
 * @author neo-w7
 * Date: 2022-08-25
 * Description:
 */
public interface UserService extends IService<NeoUser> {
    NeoUser getUserByUsername(String username);
}
