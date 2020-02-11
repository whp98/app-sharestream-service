package xyz.intellij.appsharestream.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.intellij.appsharestream.mapper.UserMapper;
import xyz.intellij.appsharestream.model.User;

@Service
public class UserService {
    private UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User add(User user) {
        userMapper.add(user);
        return findByEmail(user.getUserEmail());
    }

    public User findById(long id) {
        User user = new User();
        user.setUserId(id);
        return userMapper.findOne(user);
    }

    public User findByName(String name) {
        User param = new User();
        param.setUserNikename(name);
        return userMapper.findOne(param);
    }

    public User findByEmail(String email){
        User param = new User();
        param.setUserEmail(email);
        return userMapper.findOne(param);
    }
}