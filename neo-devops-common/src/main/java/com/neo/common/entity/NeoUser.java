package com.neo.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author neo-w7
 * Date: 2022-08-24
 * Description:
 */
@Data
public class NeoUser {
    @TableId(type = IdType.AUTO,value = "id")
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}
