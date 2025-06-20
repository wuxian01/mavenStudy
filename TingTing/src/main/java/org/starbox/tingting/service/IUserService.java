package org.starbox.tingting.service;

import org.springframework.stereotype.Service;
import org.starbox.tingting.pojo.User;
import org.starbox.tingting.pojo.dto.UserDto;

@Service //spring的bean
public interface IUserService {
    /**
     *
     * @param user
     */
    User add(UserDto user);

    User getUser(Integer uid);

    User update(UserDto user);

    void delUser(Integer uid);
}
