package org.starbox.tingting.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.starbox.tingting.pojo.User;
import org.starbox.tingting.pojo.dto.UserDto;
import org.starbox.tingting.repository.UserRepository;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User add(UserDto user) {
        User userPojo = new User();
        BeanUtils.copyProperties(user,userPojo);
        return userRepository.save(userPojo);
    }

    @Override
    public User getUser(Integer uid) {
        return userRepository.findById(uid).orElseThrow(()->{
            throw new IllegalArgumentException("User not found");
        });
    }

    @Override
    public User update(UserDto user) {
        User userPojo = new User();
        BeanUtils.copyProperties(user,userPojo);


        return userRepository.save(userPojo);
    }

    @Override
    public void delUser(Integer uid) {
        userRepository.deleteById(uid);
    }
}
