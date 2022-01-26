package br.com.guilherme.aprendendospring.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosController {

    @GetMapping
    public String get() {
        return "Requisição GET";
    }

    @PostMapping
    public String post() {
        return "Requisição POST";
    }

    @PutMapping
    public String put() {
        return "Requisição PUT";
    }

    @DeleteMapping
    public String delete() {
        return "Requisição DELETE";
    }

    @PatchMapping
    public String patch() {
        return "Requisição PATCH";
    }
}
