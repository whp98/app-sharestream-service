package xyz.intellij.appsharestream.mapper;

import xyz.intellij.appsharestream.model.User;

public interface UserMapper {
    long add(User user);
    User findOne(User user);
}
