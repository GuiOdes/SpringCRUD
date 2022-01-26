package br.com.guilherme.aprendendospring.services;

import br.com.guilherme.aprendendospring.model.entities.Produto;
import br.com.guilherme.aprendendospring.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired private ProdutoRepository produtoRepository;

    // Tanto salva quanto atualiza, de acordo com o método do controller
    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto); // Salvando produto no banco de dados
    }

    public Iterable<Produto> obterProdutos(int numeroPagina) {
        PageRequest page = PageRequest.of(numeroPagina-1, 2);
        return produtoRepository.findAll(page);
    }

    public Optional<Produto> findById(int id) {
        return produtoRepository.findById(id);
    }

    public Iterable<Produto> findByNome(String nome) {
        return produtoRepository.findByNomeContaining(nome);
    }

    public boolean apagarProduto(int id) {
        if (produtoRepository.existsById(id)){
            produtoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public String findNameByID(int id) {
        return produtoRepository.findNameByID(id);
    }
}
