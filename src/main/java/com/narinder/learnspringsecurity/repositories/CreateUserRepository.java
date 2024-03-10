package com.narinder.learnspringsecurity.repositories;

import com.narinder.learnspringsecurity.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreateUserRepository extends JpaRepository<Users, String> {

}
