package com.shadowroland.basespring.controller;

import com.shadowroland.basespring.entity.User;
import com.shadowroland.basespring.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public User toIndex(HttpServletRequest request, Model model){
        Long userId = Long.parseLong(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        return user;
    }
}
