package br.edu.fatecfranca.Exercicio2;

import br.edu.fatecfranca.Exercicio2.model.PedidoEntrega;
import br.edu.fatecfranca.Exercicio2.repository.PedidoEntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoEntregaService {
    @Autowired
    private PedidoEntregaRepository pedidoEntregaRepository;

    //metodo para listar todos
    public List<PedidoEntrega> listaTodos(){
        return pedidoEntregaRepository.findAll();
    }

    //metodo para buscar por id
    public Optional<PedidoEntrega> listaPorId(Long id){
        return pedidoEntregaRepository.findById(id);
    }

    //metodo para inserir um cliente na tabela tb_cliente
    public PedidoEntrega insere(PedidoEntrega pedidoEntrega){
        return pedidoEntregaRepository.save(pedidoEntrega);
    }

    //metodo para remover um cliente da tabela
    public boolean remove(Long id){
        if(pedidoEntregaRepository.existsById(id)){
            pedidoEntregaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    //metodo para fazer atualização
    public PedidoEntrega atualizar(Long id, PedidoEntrega novoPedidoEntrega){
        if (pedidoEntregaRepository.existsById(id)){
            novoPedidoEntrega.setId(id);
            return pedidoEntregaRepository.save(novoPedidoEntrega);
        }
        return null;
    }
}
