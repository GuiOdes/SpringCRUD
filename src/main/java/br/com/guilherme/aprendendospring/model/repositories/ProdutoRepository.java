package br.com.guilherme.aprendendospring.model.repositories;

import br.com.guilherme.aprendendospring.model.entities.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

// Essa classe é respondável por todo o crud e interações com o banco de dados da aplicação
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> /* Classe para persistir e tipo do ID */
{
    public Iterable<Produto> findByNomeContaining (String pesquisa);

    // Caso necessite fazer uma query na mão use anotação
    @Query("SELECT nome FROM Produto produto WHERE id = :id")
    public String findNameByID(int id);
}
