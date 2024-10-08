package com.telusko.SpringSecurityEx.repo;

import com.telusko.SpringSecurityEx.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {
    Users findByUsername(String username);
}
