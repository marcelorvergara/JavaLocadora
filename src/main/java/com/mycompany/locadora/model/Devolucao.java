/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.locadora.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author marcelo
 */
public class Devolucao {

    private LocalDateTime dataPrevista;
    private LocalDateTime dataReal;
    private BigDecimal valor;

    public Devolucao(LocalDateTime dataPrevista, LocalDateTime dataReal, BigDecimal valor) {
        this.dataPrevista = dataPrevista;
        this.dataReal = dataReal;
        this.valor = valor;
    }

    public Devolucao(LocalDateTime dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    /**
     * @return the dataPrevista
     */
    public LocalDateTime getDataPrevista() {
        return dataPrevista;
    }

    /**
     * @param dataPrevista the dataPrevista to set
     */
    public void setDataPrevista(LocalDateTime dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    /**
     * @return the dataReal
     */
    public LocalDateTime getDataReal() {
        return dataReal;
    }

    /**
     * @param dataReal the dataReal to set
     */
    public void setDataReal(LocalDateTime dataReal) {
        this.dataReal = dataReal;
    }

    /**
     * @return the valor
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

}
