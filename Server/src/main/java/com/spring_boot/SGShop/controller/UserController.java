package com.spring_boot.SGShop.controller;

import com.spring_boot.SGShop.modal.User;
import com.spring_boot.SGShop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

//    @GetMapping("/find/{lastName}")
//    public List<User> getUserByLastName(@PathVariable String lastName){
//        return userService.getUserByLastName(lastName);
//    }
    @PostMapping
    public User insertUser(@RequestBody User user){
        return userService.insertUser(user);
    }

    @PutMapping("/{id}")
    public Optional<User> updateUser(@RequestBody User user, @PathVariable Long id){
        return userService.updateUser(id,user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }
}
