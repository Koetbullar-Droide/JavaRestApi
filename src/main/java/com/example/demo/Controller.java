package com.example.demo;
import java.util.List;

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
    public List<Service> data() {

        return source.getAllData();
        
	}

    
}
