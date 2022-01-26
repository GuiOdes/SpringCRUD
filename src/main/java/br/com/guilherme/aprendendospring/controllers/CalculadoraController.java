package br.com.guilherme.aprendendospring.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    // Somando passando valores como página
    @GetMapping("/somar/{a}/{b}")
    public int somar(@PathVariable int a, @PathVariable int b) {
        return a+b;
    }

    // Subtraindo passando valores como parametros através de "?a=x&b=y"
    @GetMapping("/subtrair")
    public int subtrair(@RequestParam(name="a") int a, @RequestParam(name="b") int b){
        return a-b;
    }
}
