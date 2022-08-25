package com.neo.resource.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author neo-w7
 * Date: 2022-08-25
 * Description:
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    /**
     * 老师权限
     */
    @GetMapping("/math/grade")
    @PreAuthorize("hasAuthority('teacher')")
    public Object rs() {
        List<Map<String, Object>> maps = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("张三" + i, 100);
            maps.add(map);
        }
        return maps;
    }
}

