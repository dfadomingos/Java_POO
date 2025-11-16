package br.edu.fatecfranca.Exercicio2.controller;

import br.edu.fatecfranca.Exercicio2.PedidoEntregaService;
import br.edu.fatecfranca.Exercicio2.model.PedidoEntrega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/{pedidoentrega}")
public class PedidoEntregaController {
    @Autowired
    private PedidoEntregaService pedidoEntregaService;

    @GetMapping
    public List<PedidoEntrega> listaTodos(){
        return pedidoEntregaService.listaTodos();
    }

    @GetMapping("/{id}")
    public Optional<PedidoEntrega> listaPorId(@PathVariable Long id){
        return pedidoEntregaService.listaPorId(id);
    }

    @PostMapping
    public PedidoEntrega insere(@RequestBody PedidoEntrega pedidoEntrega){
        return pedidoEntregaService.insere(pedidoEntrega);
    }

    @DeleteMapping("/{id}")
    public boolean remove(@PathVariable Long id){
        return pedidoEntregaService.remove(id);
    }

    @PutMapping("/{id}")
    public PedidoEntrega atualizar(@PathVariable Long id, @RequestBody PedidoEntrega novoPedidoEntrega){
        return pedidoEntregaService.atualizar(id, novoPedidoEntrega);
    }
}
