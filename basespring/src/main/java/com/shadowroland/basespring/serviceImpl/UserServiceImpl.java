package com.shadowroland.basespring.serviceImpl;

import com.shadowroland.basespring.entity.User;
import com.shadowroland.basespring.mapper.UserMapper;
import com.shadowroland.basespring.service.UserService;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public User getUserById(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    public boolean addUser(User record){
        boolean result = false;
        try {
            userMapper.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
