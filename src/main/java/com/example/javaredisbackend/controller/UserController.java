package com.example.javaredisbackend.controller;

import com.example.javaredisbackend.model.User;
import com.example.javaredisbackend.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository repo;

    // ✅ Correct constructor
    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return repo.save(user);
    }

    @GetMapping("/{id}")
    public Optional<User> get(@PathVariable String id) {
        return repo.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }

    @GetMapping("/health")
    public Map<String, String> health()
    {
        return Map.of("status","UP");
    }
}
