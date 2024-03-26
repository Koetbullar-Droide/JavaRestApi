package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.example.demo.Models.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.InputStream;

public class DataService {

     private List<Service> services;

    public DataService() {
         try {
            ObjectMapper objectMapper = new ObjectMapper();

            InputStream inputStreamJsonFile = getClass().getClassLoader().getResourceAsStream("data.json");
            // JSON-Datei in eine Liste von Service-Objekten einlesen
            this.services = Arrays.asList(objectMapper.readValue(inputStreamJsonFile, Service[].class));

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Service> getAllData() {
        return services;
    }

    
    public Optional<Service> getServiceById(int id) {
        return services.stream()
                .filter(service -> service.getId() == id)
                .findFirst();
    }
    


}
