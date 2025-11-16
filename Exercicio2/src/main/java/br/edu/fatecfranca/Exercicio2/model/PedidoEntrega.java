package br.edu.fatecfranca.Exercicio2.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_pedido_entrega")
public class PedidoEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Double valor;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataEntrega;

    public PedidoEntrega() {
    }

    public PedidoEntrega(String descricao, Double valor, LocalDate dataEntrega) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataEntrega = dataEntrega;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}

