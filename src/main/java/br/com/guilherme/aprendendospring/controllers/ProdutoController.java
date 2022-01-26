package br.com.guilherme.aprendendospring.controllers;

import br.com.guilherme.aprendendospring.model.entities.Produto;
import br.com.guilherme.aprendendospring.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/produtos") // Definindo URL principal
public class ProdutoController {

    @Autowired private ProdutoService produtoService;

    @RequestMapping(path = "/salvar-produto", method = {RequestMethod.POST, RequestMethod.PUT}) // Definindo URL do método, que executará somente com req POST
    public Produto novoProduto(Produto produto) {
        return produtoService.salvarProduto(produto);
    }

    @GetMapping(path = "/pagina/{numeroPagina}")
    public Iterable<Produto> obterProdutos(@PathVariable int numeroPagina) {
        return produtoService.obterProdutos(numeroPagina);
    }

    @GetMapping(path = "/get-produtos-id/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
        return produtoService.findById(id);
    }

    @GetMapping(path = "/get-produtos-nome/{nome}")
    public Iterable<Produto> obterProdutoPorNome(@PathVariable String nome) {
        return produtoService.findByNome(nome);
    }

    @DeleteMapping(path = "/excluir-produto/{id}")
    public boolean apagarProduto(@PathVariable int id) {
        return produtoService.apagarProduto(id);
    }

    // Exemplo com query criada manualmente.
    @GetMapping(path = "/get-nome-by-id/{id}")
    public String obterNomePorID(@PathVariable int id){
        return produtoService.findNameByID(id);
    }

}
