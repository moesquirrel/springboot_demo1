package cn.yaya.controller;

import cn.yaya.mapper.UserMapper;
import cn.yaya.pojo.User;
import cn.yaya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/show")
    @ResponseBody
    public void findAll(){
        List<User> all = userService.findAll();
        for (User user : all) {

            System.out.println(user);
        }
    }
}
