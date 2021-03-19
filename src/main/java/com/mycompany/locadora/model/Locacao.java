/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.locadora.model;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author marcelo
 */
public class Locacao {

    private List<Filme> filmes;
    private Cliente cliente;
    private LocalDateTime data;
    private Devolucao devolucao;

    public Locacao(List<Filme> filmes, Cliente cliente, LocalDateTime data, Devolucao devolucao) {
        this.filmes = filmes;
        this.cliente = cliente;
        this.data = data;
        this.devolucao = devolucao;
    }

    public Locacao(List<Filme> filmes, Cliente cliente) {
        this.filmes = filmes;
        this.cliente = cliente;
    }

    /**
     * @return the filmes
     */
    public List<Filme> getFilmes() {
        return filmes;
    }

    /**
     * @param filmes the filmes to set
     */
    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the data
     */
    public LocalDateTime getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(LocalDateTime data) {
        this.data = data;
    }

    /**
     * @return the devolucao
     */
    public Devolucao getDevolucao() {
        return devolucao;
    }

    /**
     * @param devolucao the devolucao to set
     */
    public void setDevolucao(Devolucao devolucao) {
        this.devolucao = devolucao;
    }

}
