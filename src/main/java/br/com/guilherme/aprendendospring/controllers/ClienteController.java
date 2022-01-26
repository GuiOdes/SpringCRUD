package br.com.guilherme.aprendendospring.controllers;

import br.com.guilherme.aprendendospring.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {
        return new Cliente(28, "Pedro", "123.456.789-00");
    }

    @GetMapping
    public Cliente clientePorID(
            @RequestParam(name = "id") int id,
            @RequestParam(name = "nome") String nome
    ) { // Método recebendo parâmetros pela URL
        return new Cliente(id, nome, "987.654.321-11");
    }
}
