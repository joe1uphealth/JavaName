package com.example.demo.controllers;

import com.example.demo.requests.Name;
import com.example.demo.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {

    @Autowired
    private NameService nameService;


    @GetMapping("/hello")
    public String helloGet() {
        return "hello";
    }

    @PostMapping("/capitalize")
    public Name captializeName(@RequestBody Name name) {
        return nameService.capitializeName(name);
    }

    @GetMapping("/getJoes")
    public List<Name> getJoes() {
        return nameService.findAllJoes();
    }

}
