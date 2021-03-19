/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.locadora.model;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import repositorio.Filmes;

/**
 *
 * @author marcelo
 */
public class NovaLocacao {

    String quantidadeFilmes;
    public List<Filme> alugados = new ArrayList<>();
    BigDecimal tot = new BigDecimal(0);
    ListarTodosFilmes ltf = new ListarTodosFilmes();

    //listar
    public NovaLocacao() {
        System.out.println("Quantos filmes da lista abaixo serão alugados?\n");
        try {
            //listando os filmes
            ltf.listarFilmes();

            //recebendo a quantidade a ser alugada
            Scanner qtd = new Scanner(System.in);
            quantidadeFilmes = qtd.nextLine();

            //pegando o código dos filmes que serão alugados
            for (int i = 0; i < Integer.parseInt(quantidadeFilmes); i++) {
                System.out.println("Entre com o código do filme:");
                alugaFilme();
            }

            //imprimir recibo
            imprimirRecibo();

        } catch (NumberFormatException e) {
            System.out.println("Tem erro no bagulho");
            System.out.println(e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(NovaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //locar
    private void alugaFilme() {
        try {
            //lendo o código
            Scanner codigo = new Scanner(System.in);
            String codFilme = codigo.nextLine();
            //pegando o filme
            Filmes filmes = new Filmes();
            int cod = Integer.parseInt(codFilme);
            Filme flm = filmes.porCodigo(cod);
            System.out.println("Filme alugado: " + flm.getTitulo());
            setAlugadoFilme(flm);
        } catch (NumberFormatException e) {
            e.getMessage();
        }
    }

    /**
     * @return the alugados
     */
    public List<Filme> getAlugados() {
        return alugados;
    }

    /**
     * @param alugados the alugados to set
     */
    public void setAlugados(List<Filme> alugados) {
        this.alugados = alugados;
    }

    public void setAlugadoFilme(Filme filme) {

        this.alugados.add(filme);
    }

    //imprimir recibo com data e valor
    private void imprimirRecibo() throws IOException {
        clearScreen();
        LocalDate hj = LocalDate.now();
        LocalDate devolucao = hj.plusDays(1);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy");

        System.out.println("\nTotal de Filme(s): " + this.alugados.size() + "\n");
        for (int i = 0; i < this.alugados.size(); i++) {
            Filme fl = this.alugados.get(i);
            System.out.println(" - Filme: " + fl.getTitulo() + "\n   Devolver até: " + devolucao.format(dtf));
            System.out.println("   Valor: R$" + fl.getValor());
            tot = fl.getValor().add(tot);
        }
        System.out.println("\n");
        System.out.println("VALOR TOTAL: R$" + tot);
    }

    static void clearScreen() throws IOException {
        final String operatingSystem = System.getProperty("os.name");
        for (int clear = 0; clear < 1000; clear++) {
            System.out.println("\b");
            System.out.flush();
        }
        if (operatingSystem.contains("Windows")) {
            Runtime.getRuntime().exec("cls");
        } else {
            Runtime.getRuntime().exec("clear");
        }
    }
}
