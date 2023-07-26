package com.spring_boot.SGShop.Repository;

import com.spring_boot.SGShop.Modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends BaseRepository<User, Long> {
    public List<User> findUserByLastName(String lastName);
}
