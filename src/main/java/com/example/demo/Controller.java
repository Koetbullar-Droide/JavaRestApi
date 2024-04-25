package com.example.demo;
import java.util.List;
import java.util.Optional;

import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {
    @Autowired
    private UserRepository userRepository;

    
    @PostMapping("/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam(name = "email", required = false) String email) {

        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "saved";

        
	}

    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();

	}

    
}
