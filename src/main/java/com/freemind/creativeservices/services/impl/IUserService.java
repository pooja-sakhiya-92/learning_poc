package com.freemind.creativeservices.services.impl;

import com.freemind.creativeservices.model.User;

import java.util.List;

public interface IUserService {
    User findUserById(String id);

    List<User> findAllUsers();

    void deleteUser(String id);

    User addUser(User user);
}
