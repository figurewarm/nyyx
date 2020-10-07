package com.jiaobuqifangzu.nyyx.dao.repository;

import com.jiaobuqifangzu.nyyx.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {

    public User findByUsernameAndPassword(String username, String password);

    public User findByUsername(String username);

    public Optional<User> findById(Integer id);

}
