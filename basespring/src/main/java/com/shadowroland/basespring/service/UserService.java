package com.shadowroland.basespring.service;

import com.shadowroland.basespring.entity.User;

public interface UserService {
    User getUserById(Long userId);

    boolean addUser(User record);
}
