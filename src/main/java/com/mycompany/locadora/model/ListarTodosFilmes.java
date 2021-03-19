/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.locadora.model;

import repositorio.Filmes;

/**
 *
 * @author marcelo
 */
public class ListarTodosFilmes {

    Filmes flm = new Filmes();
    Filme[] filmes = flm.todos();

    public ListarTodosFilmes() {

    }

    public void listarFilmes() {
        for (Filme filme : filmes) {
            System.out.println("Título: " + filme.getTitulo() + " / Código: " + filme.getCod());
        }
    }
}
