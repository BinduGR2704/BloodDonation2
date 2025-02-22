package net.guides.springboot.Admin_User.service;

import net.guides.springboot.Admin_User.dto.UserDto;
import net.guides.springboot.Admin_User.model.User;



public interface UserService {

    User save(UserDto userDto);

    public void delete(long id);

    public void saveDonor(User user);

    public User getDonorById(long id);

}


