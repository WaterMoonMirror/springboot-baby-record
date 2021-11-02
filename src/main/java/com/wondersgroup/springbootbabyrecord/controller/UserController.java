package com.wondersgroup.springbootbabyrecord.controller;

import com.wondersgroup.springbootbabyrecord.common.utils.JSONResult;
import com.wondersgroup.springbootbabyrecord.pojo.Users;
import com.wondersgroup.springbootbabyrecord.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: lz
 * @time: 2021/10/29 16:53
 */

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping()
    public JSONResult queryAllUser(){
        List<Users> users = service.queryAllUser();
        return JSONResult.ok(users);
    }
}
