package com.example.mongo.resources;

import com.example.mongo.Dancing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmployeeController {
    @Autowired
    Dancing dancing;
@GetMapping("/dancing")
    public String sedMessage(){
       // return "Hello, I am doing Good";
    System.out.println("dancing");
 return    dancing.getMessage();
    }
}
