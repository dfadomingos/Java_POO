package com.example.demo.controller;

import com.example.demo.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produto")
//classe vai responder pelas requisições /mensagem

public class ExemploController {
    List<Produto> produtos = new ArrayList<Produto>();

    //verbo get
    @GetMapping
    public List<Produto> consulta(){
        return produtos;
    }

    //verbo get
    @GetMapping("/{id}")
    public Produto consultaPersonalizada(@PathVariable int id){
        for(Produto produto: produtos){
            if (produto.getId() == id){
                return produto;
            }
        }
        //não encontrou
        return null;
    }

    //verbo post
    @PostMapping
    public Produto insere(@RequestBody Produto produto){
        produtos.add(produto);
        return produto;
    }

    //verbo delete
    @DeleteMapping("/{id}")
    public boolean remover (@PathVariable int id){
        for (Produto produto: produtos){
            if (produto.getId() == id){
                return produtos.remove(produto);
            }
        }
        //não encontrou
        return false;
    }

    //verbo PUT - atualiza um produto
    @PutMapping("/{id}")
    public boolean atualiza(@PathVariable int id, @RequestBody Produto novoProduto){
        //procura o produto para remover
        for (Produto produto: produtos){
            if (produto.getId() == id){
                produto.setNome(novoProduto.getNome());
                produto.setQtde(novoProduto.getQtde());
                produto.setPreco(novoProduto.getPreco());
                return true;
            }
        }
        return false; //não encontrou
    }
}
