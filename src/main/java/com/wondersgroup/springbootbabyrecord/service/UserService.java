package com.wondersgroup.springbootbabyrecord.service;

import com.wondersgroup.springbootbabyrecord.bo.UsersBO;
import com.wondersgroup.springbootbabyrecord.pojo.Users;

import java.util.List;

/**
 * @description: 用户服务
 * @author: lz
 * @time: 2021/10/29 16:44
 */
public interface UserService {
    List<Users> queryAllUser();
    void AddUser(UsersBO usersBO);
}
