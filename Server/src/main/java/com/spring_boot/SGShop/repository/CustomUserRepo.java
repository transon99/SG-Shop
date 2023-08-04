package com.spring_boot.SGShop.repository;

import com.spring_boot.SGShop.modal.User;

import java.util.List;

public interface CustomUserRepo extends UserRepository{
    public List<User> findUserByLastName(String lastName);
}
