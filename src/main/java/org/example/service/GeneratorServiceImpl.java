package org.example.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GeneratorServiceImpl implements GeneratorService{
    @Override
    public UUID generateUUID() {
        return UUID.randomUUID();
    }
}
