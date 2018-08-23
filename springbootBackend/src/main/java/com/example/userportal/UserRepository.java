package com.example.userportal;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.Repository;

public interface UserRepository extends CrudRepository<User, Integer> {

    void delete(User user);

    List<User> findAll();

   // User findOne(int id);

    User save(User user);
}
