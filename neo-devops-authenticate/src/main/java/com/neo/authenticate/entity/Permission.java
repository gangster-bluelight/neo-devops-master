package com.neo.authenticate.entity;

import lombok.Data;

/**
 * @author neo-w7
 * Date: 2022-08-24
 * Description:
 */
@Data
public class Permission {
    private Integer id;

    private String code;

    private String description;

    private String url;
}
