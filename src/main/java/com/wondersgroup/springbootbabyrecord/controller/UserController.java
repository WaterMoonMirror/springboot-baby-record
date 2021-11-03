package com.wondersgroup.springbootbabyrecord.controller;

import com.wondersgroup.springbootbabyrecord.bo.UsersBO;
import com.wondersgroup.springbootbabyrecord.common.utils.JSONResult;
import com.wondersgroup.springbootbabyrecord.pojo.Users;
import com.wondersgroup.springbootbabyrecord.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: lz
 * @time: 2021/10/29 16:53
 */

@RestController
@RequestMapping("/user")
@Api(value = "用户访问器",tags = {"用户访问器"})
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @ApiOperation(value = "获取全部用户列表",notes = "获取全部用户列表",httpMethod = "GET")
    @GetMapping()
    public JSONResult queryAllUser(){
        List<Users> users = service.queryAllUser();
        return JSONResult.ok(users);
    }
    @ApiOperation(value = "添加用户",notes = "添加用户",httpMethod = "POST")
    @PostMapping()
    public JSONResult addUser(@RequestBody UsersBO usersBO){
         service.AddUser(usersBO);
        return JSONResult.ok();
    }
}
