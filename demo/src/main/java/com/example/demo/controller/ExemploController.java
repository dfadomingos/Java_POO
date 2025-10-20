package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensagem")
//classe vai responder pelas requisições /mensagem

public class ExemploController {

    //verbo get
    @GetMapping
    public String consulta(){
        return "Este método faz um select no banco de dados";
    }

    //verbo get
    @GetMapping("/{nome}/{sobrenome}")
    public String consultaPersonalizada(@PathVariable String nome, @PathVariable String sobrenome){
        return "Também faz select, agora com a cláusula where " + nome + " " + sobrenome;
    }

    //verbo post
    @PostMapping
    public String insere(){
        return "Este método faz um insert no banco de dados";
    }

}
