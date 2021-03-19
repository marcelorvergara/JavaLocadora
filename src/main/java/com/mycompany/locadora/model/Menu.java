/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.locadora.model;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class Menu {

    public static void main(String[] args) {
        try {
            String opc = mostraMenu();
            //alugar
            if ("1".equals(opc)) {
                NovaLocacao nl = new NovaLocacao();
                //devolver
            } else if ("2".equals(opc)) {
                System.out.println("Devolver Filme");
            } else if ("3".equals(opc)) {
                System.out.println("Cadastrar Filme");
            }
        } catch (Exception e) {
            System.out.println("Erro" + e.getMessage());
        }

    }

    private static String mostraMenu() {
        System.out.println("Menu Locadora");
        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Alugar filme(s)");
        System.out.println("2 - Devolver filme(s)");
        System.out.println("3 - Cadastrar fime(s)");

        String opcao = "";

        try {
            Scanner scn = new Scanner(System.in);
            opcao = scn.nextLine();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return opcao;
    }
}
