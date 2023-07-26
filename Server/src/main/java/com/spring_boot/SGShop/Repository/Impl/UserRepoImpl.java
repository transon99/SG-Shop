package com.spring_boot.SGShop.Repository.Impl;

import com.spring_boot.SGShop.Modal.User;
import com.spring_boot.SGShop.Repository.UserRepository;
import jakarta.persistence.EntityManager;

import java.util.List;

public class UserRepoImpl extends BaseRepoImpl<User, Long> implements UserRepository {
    public UserRepoImpl(EntityManager em) {
        super(User.class, em);
    }
@Override
    public List<User> findUserByLastName(String lastName) {
        return
                jpaQueryFactory
                        .select(user)
                        .from(user)
                        .where(user.lastName.equalsIgnoreCase(lastName))
                        .fetch();
    }

}
