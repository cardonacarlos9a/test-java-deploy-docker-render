package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class RestControllerPrueba {

    @GetMapping
    public String buscar(){
        return "Prueba get";
    }

}
