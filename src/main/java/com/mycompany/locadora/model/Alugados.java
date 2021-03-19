/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.locadora.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author marcelo
 */
public class Alugados {

    //Integer é a matríclua do indivíduo
    static Map<Integer, List<Filme>> listaAlugados = new HashMap<>();

    public Alugados() {

    }

    /**
     * @return the listaAlugados
     */
    public static Map<Integer, List<Filme>> getListaAlugados() {
        return listaAlugados;
    }

    /**
     * @param listaAlugados the listaAlugados to set
     * @param mat
     */
    public static void setListaAlugados(List<Filme> listaAlugados, Integer mat) {
        Alugados.listaAlugados.put(mat, listaAlugados);
    }
}
