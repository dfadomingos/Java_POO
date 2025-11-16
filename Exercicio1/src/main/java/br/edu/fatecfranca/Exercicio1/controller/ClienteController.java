package br.edu.fatecfranca.Exercicio1.controller;

import br.edu.fatecfranca.Exercicio1.ClienteService;
import br.edu.fatecfranca.Exercicio1.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listaTodos(){
        return clienteService.listaTodos();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> listaPorId(@PathVariable Long id){
        return clienteService.listaPorId(id);
    }

    @PostMapping
    public Cliente insere(@RequestBody Cliente cliente){
        return clienteService.insere(cliente);
    }

    @DeleteMapping("/{id}")
    public boolean remover(@PathVariable Long id){
        return clienteService.remove(id);
    }

    @PutMapping("/{id}")
    public Cliente atualizar (@PathVariable Long id, @RequestBody Cliente novoCliente){
        return clienteService.atualizar(id, novoCliente);
    }
}
