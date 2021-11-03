package com.wondersgroup.springbootbabyrecord.service.impl;

import com.wondersgroup.springbootbabyrecord.bo.UsersBO;
import com.wondersgroup.springbootbabyrecord.common.org.n3r.idworker.Sid;
import com.wondersgroup.springbootbabyrecord.common.utils.MD5Utils;
import com.wondersgroup.springbootbabyrecord.mapper.UsersMapper;
import com.wondersgroup.springbootbabyrecord.pojo.Users;
import com.wondersgroup.springbootbabyrecord.service.UserService;
import lombok.SneakyThrows;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: lz
 * @time: 2021/10/29 16:52
 */
@Service
public class UserServiceImpl implements UserService {
    private static final String USER_FACE = "http://122.152.205.72:88/group1/M00/00/05/CpoxxFw_8_qAIlFXAAAcIhVPdSg994.png";
    @Autowired
    private  UsersMapper usersMapper;



    @Override
    public List<Users> queryAllUser() {
        return usersMapper.selectAll();
    }

    @SneakyThrows
    @Override
    public void AddUser(UsersBO usersBO) {
        String userId = Sid.next();
        Users users=new Users();
        BeanUtils.copyProperties(usersBO,users);
        users.setId(userId);
        users.setCreatedTime(new Date());
        users.setUpdatedTime(new Date());
        users.setFace(USER_FACE);
        users.setPassword(MD5Utils.getMD5Str(usersBO.getPassword()));
        usersMapper.insert(users);
    }
}
