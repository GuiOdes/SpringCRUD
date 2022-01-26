package br.com.guilherme.aprendendospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    //@RequestMapping(method = RequestMethod.GET, path = "/ola")
    @GetMapping(path = "/ola")
    public String ola() {
        return "Olá, mundo! Parabéns, Gui <3 <3 <3 ^^ =D *o*";
    }


}
