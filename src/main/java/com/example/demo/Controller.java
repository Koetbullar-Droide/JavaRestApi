package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Service;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Controller {

    private DataService source;

    public Controller() {
        this.source = new DataService();
    }

    
    @GetMapping("/data")
    public List<Service> data(@RequestParam(name = "id", required = false) Integer id) {

        if (id != null) {
            return source.getServiceById(id).map(List::of).orElse(List.of());
            
        } else {
            return source.getAllData();
        }
	}

    
}
