package org.starbox.tingting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.starbox.tingting.pojo.ResponseMessage;
import org.starbox.tingting.pojo.User;
import org.starbox.tingting.pojo.dto.UserDto;
import org.starbox.tingting.service.IUserService;

@RestController // 接口方法返回对象，转换成json
@RequestMapping("/user")   // localhost:8088/user/**
public class UserController {
    @Autowired
    IUserService userService;
    // 增
    @PostMapping //url: post localhost:8088/user
    public ResponseMessage<User> addUser(@Validated @RequestBody UserDto user){
        User u = userService.add(user);
        return ResponseMessage.success(u);
    }
    // 删
    @DeleteMapping("/{uid}")
    public ResponseMessage delUser(@PathVariable Integer uid) {
       userService.delUser(uid);
       return ResponseMessage.success();
    }
    // 改
    @PutMapping
    public ResponseMessage update(@Validated @RequestBody UserDto user) {
        User u = userService.update(user);
        return ResponseMessage.success(u);
    }


    // 查
    @GetMapping("/{uid}")
    public ResponseMessage<User> getUser(@PathVariable Integer uid) {
        User u = userService.getUser(uid);
        return ResponseMessage.success(u);
    }
}
