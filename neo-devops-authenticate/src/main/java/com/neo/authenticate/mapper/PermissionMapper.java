package com.neo.authenticate.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neo.authenticate.entity.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author neo-w7
 * Date: 2022-08-25
 * Description:
 */
@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {
    @Select("SELECT" +
            " id,code,description,url " +
            " FROM" +
            " t_permission " +
            " WHERE" +
            " id IN (" +
            " SELECT permission_id FROM t_role_permission WHERE role_id IN (" +
            " SELECT role_id FROM t_user_role WHERE user_id = #{userId} ) )")
    List<Permission> selectPermissionsByUserId(@Param("userId") Integer userId);

}
