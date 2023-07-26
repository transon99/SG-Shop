package com.spring_boot.SGShop.Service.ServiceImpl;

import com.spring_boot.SGShop.Modal.Address;
import com.spring_boot.SGShop.Modal.User;
import com.spring_boot.SGShop.Repository.AddressRepository;
import com.spring_boot.SGShop.Repository.UserRepository;
import com.spring_boot.SGShop.Service.UserService;
import com.spring_boot.SGShop.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    AddressRepository addressRepository;
    @Override
    public List<User> getAllUser() {
        List<User> userList= userRepository.findAll();
        if (userList.isEmpty())
            throw new NotFoundException("Can't find any user");
        return userList;
    }

    @Override
    public Optional<User> getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty())
            throw new NotFoundException("Student Not Found");
        return user;
    }

    @Override
    public User insertUser(User user) {
        Address address = addressRepository.findById(user.getAddress().getId()).get();
        user.setAddress(address);
        userRepository.save(user);
        return user;
    }

    @Override
    public String deleteUser(Long id) {
        Optional<User> user= userRepository.findById(id);
        if (user.isPresent()){
            userRepository.deleteById(id);
            return "Delete user successfully !!!";
        }
        throw new NotFoundException("Can't find User to delete");


    }

    @Override
    public Optional<User> updateUser(Long id, User newUser) {
        Optional<User> userUpdate = userRepository.findById(id)
                .map(user ->
                {   user.setAddress(newUser.getAddress());
                    user.setEmail(newUser.getEmail());
                        user.setFirstName(newUser.getFirstName());
                        user.setLastName(newUser.getLastName());
                    user.setPhoneNumber(newUser.getPhoneNumber());
                    return userRepository.save(user);
                }
        );
        return userUpdate;
    }

    @Override
    public List<User> getUserByLastName(String lastName) {
        return userRepository.findUserByLastName(lastName);
    }
}
