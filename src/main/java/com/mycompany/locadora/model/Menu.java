/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.locadora.model;

import java.util.Scanner;
import repositorio.Clientes;

/**
 *
 * @author marcelo
 */
public class Menu {

    public static void main(String[] args) {
        while (true) {
            try {
                //entrar com o cliente
                Clientes cli = new Clientes();
                cli.listaClientes();
                System.out.println("Entre com a matrícula do cliente: ");
                Scanner scn = new Scanner(System.in);
                int matCli = Integer.parseInt(scn.nextLine());

                String opc = mostraMenu();
                //alugar
                if ("1".equals(opc)) {
                    NovaLocacao nl = new NovaLocacao(matCli);
                    //devolver
                } else if ("2".equals(opc)) {
                    System.out.println("Qual filme gostaria de devolver?\n");
                    Devolucao dvlc = new Devolucao(matCli);
                } else if ("3".equals(opc)) {
                    System.out.println("Cadastrar Filme");
                } else if ("4".equals(opc)) {
                    System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Erro" + e.getMessage());
            }
        }

    }

    private static String mostraMenu() {
        System.out.println("Menu Locadora");
        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Alugar filme(s)");
        System.out.println("2 - Devolver filme(s)");
        System.out.println("3 - Cadastrar fime(s)");
        System.out.println("4 - Sair");

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
