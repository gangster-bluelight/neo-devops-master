package com.neo.authenticate.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neo.common.entity.NeoUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author neo-w7
 * Date: 2022-08-25
 * Description:
 */
@Mapper
public interface UserMapper extends BaseMapper<NeoUser> {
}
