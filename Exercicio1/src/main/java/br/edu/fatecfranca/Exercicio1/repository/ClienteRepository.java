package br.edu.fatecfranca.Exercicio1.repository;

import br.edu.fatecfranca.Exercicio1.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
