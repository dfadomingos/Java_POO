package br.edu.fatecfranca.Exercicio1;

import br.edu.fatecfranca.Exercicio1.model.Cliente;
import br.edu.fatecfranca.Exercicio1.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //metodo para listar todos
    public List<Cliente> listaTodos(){
        return clienteRepository.findAll();
    }

    //metodo para buscar por id
    public Optional<Cliente> listaPorId(Long id){
        return clienteRepository.findById(id);
    }

    //metodo para inserir um cliente na tabela tb_cliente
    public Cliente insere(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    //metodo para remover um cliente da tabela
    public boolean remove(Long id){
        if(clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
            return true;
        }
        return false;
    }

    //metodo para fazer atualização
    public Cliente atualizar(Long id, Cliente novoCliente){
        if (clienteRepository.existsById(id)){
            novoCliente.setId(id);
            return clienteRepository.save(novoCliente);
        }
        return null;
    }
}
