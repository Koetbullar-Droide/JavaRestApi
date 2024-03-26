package com.example.demo;

import java.util.Arrays;
import java.util.List;

import com.example.demo.Models.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;


public class DataService {

     private List<Service> services;

    public DataService() {
         try {
            ObjectMapper objectMapper = new ObjectMapper();

            // JSON-Datei in eine Liste von Service-Objekten einlesen
            this.services = Arrays.asList(objectMapper.readValue(new File("data.json"), Service[].class));

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Service> getAllData() {
        return services;
    }


}
