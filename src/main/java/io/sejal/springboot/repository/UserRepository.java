package io.sejal.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.sejal.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
