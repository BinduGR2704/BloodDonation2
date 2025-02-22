package net.guides.springboot.Admin_User.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import net.guides.springboot.Admin_User.dto.UserDto;
import net.guides.springboot.Admin_User.model.User;
import net.guides.springboot.Admin_User.repositories.UserRepository;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(UserDto userDto) {
        User user = new User(userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()), userDto.getRole(), userDto.getFullname(), userDto.getBloodgroup(), userDto.getGender(), userDto.getAge(), userDto.getAddress(), userDto.getPhoneno(),userDto.getMedical(),userDto.getNum());
        return userRepository.save(user);
    }

    public User get(long id){
        return userRepository.findById(id).get();
    }


    public void delete(long id) {

        userRepository.deleteById(id);
    }



    public void saveDonor(User user) {

        userRepository.save(user);
    }


    public User getDonorById(long id) {
        Optional<User> user = userRepository.findById(id);

        if (user.isPresent()) {
            return user.get();
        }
        return null;
    }
}


