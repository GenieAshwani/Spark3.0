package com.genie.Ecomm.repo;

import com.genie.Ecomm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);
}
