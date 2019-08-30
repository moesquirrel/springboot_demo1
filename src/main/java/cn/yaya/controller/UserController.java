package cn.yaya.controller;

import cn.yaya.mapper.UserMapper;
import cn.yaya.pojo.User;
import cn.yaya.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import org.apache.log4j.Logger;
@Controller
@RequestMapping("/user")
public class UserController {
    static Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/show")
    @ResponseBody
    public void findAll() {
        //记录日志
        logger.info("operation findAll");
        List<User> all = userService.findAll();
        for (User user : all) {

            System.out.println(user);
        }
    }
}
