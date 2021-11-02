package com.wondersgroup.springbootbabyrecord.service.impl;

import com.wondersgroup.springbootbabyrecord.mapper.UsersMapper;
import com.wondersgroup.springbootbabyrecord.pojo.Users;
import com.wondersgroup.springbootbabyrecord.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: lz
 * @time: 2021/10/29 16:52
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UsersMapper usersMapper;



    @Override
    public List<Users> queryAllUser() {
        return usersMapper.selectAll();
    }
}
