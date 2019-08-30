package cn.yaya.service.impl;

import cn.yaya.mapper.UserMapper;
import cn.yaya.pojo.User;
import cn.yaya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper usermapper;

    public List<User>  findAll(){
        List<User> list= usermapper.findAll();
        return list;
    }
}
