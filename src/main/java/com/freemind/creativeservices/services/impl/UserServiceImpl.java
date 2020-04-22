package com.freemind.creativeservices.services.impl;

import com.freemind.creativeservices.model.User;
import com.freemind.creativeservices.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userRepository;

    static int id =1;

    @Override
    public User findUserById(String id){
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent())
            return user.get();
        return null;
    }


    @Override
    public List<User> findAllUsers(){
        List<User> allUsers = userRepository.findAll();
        return allUsers;
    }

    @Override
    public void deleteUser(String id){
        userRepository.deleteById(id);
    }

    @Override
    public User addUser(User user) {
        user.setUserId("user-" + id++);
        return userRepository.save(user);
    }

}
