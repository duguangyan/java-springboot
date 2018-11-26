package com.dgy.dgy.controller;

import com.dgy.dgy.dao.UserMapper;
import com.dgy.dgy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/test")
    public User getUser(HttpServletRequest request){
//        User user = new User();
//        user.setUserName("杜光焱");
        Integer id = Integer.parseInt(request.getParameter("id"));
        User user = userMapper.findUserById(id);
        return user;
    }

    @RequestMapping("/getUsers")
    public List<User> getUserAll(){
        return userMapper.findUserAll();
    }

}
