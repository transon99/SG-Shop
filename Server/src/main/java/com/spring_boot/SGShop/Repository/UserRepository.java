package com.spring_boot.SGShop.Repository;

import com.spring_boot.SGShop.Modal.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
