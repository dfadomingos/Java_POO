package br.edu.fatecfranca.ExemploBD.repository;

import br.edu.fatecfranca.ExemploBD.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    //esta interface herdara todos os metodos de crud prontos da classe Produto
    //Long indica tipo de dados da chave primaria de Pruduto

}
