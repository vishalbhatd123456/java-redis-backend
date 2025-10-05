//this is more of an interface structure

package com.example.javaredisbackend.repository;

import com.example.javaredisbackend.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String>{}