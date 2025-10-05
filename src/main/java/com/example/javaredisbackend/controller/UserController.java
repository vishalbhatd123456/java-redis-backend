package com.example.javaredisbackend.controller;

import com.example.javaredisbackend.model.User;
import com.example.javaredisbackend.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.swing.text.html.Option;

@RestController
@RequestMapping("/api/users")
public class UserController
{
    private final UserRepository repo;
    public UserRepository(UserRepository repo){
        this.repo = repo;
    }
    @PostMapping
    public User save(@RequestBody User user)
    {
        return repo.save(user);
    }
    @GetMapping("/{id}")
    public Optional<User> get(@PathVariable String id)
    {
        return repo.findById(id);
    } 
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id)
    {
        repo.deleteById(id);
    }
}