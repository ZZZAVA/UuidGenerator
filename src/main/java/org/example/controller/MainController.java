package org.example.controller;

import org.example.service.GeneratorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public record MainController(
        GeneratorService generatorService
) {

    @GetMapping("/")
    public UUID getUUID(){
        return generatorService.generateUUID();
    }
}
