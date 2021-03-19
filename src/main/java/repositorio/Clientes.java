/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import com.mycompany.locadora.model.Cliente;

/**
 *
 * @author marcelo
 */
public class Clientes {

    private static final Cliente[] clientes = {
        new Cliente("Marcelo", 1),
        new Cliente("João", 2),
        new Cliente("Maria", 3),
        new Cliente("José", 4),
        new Cliente("Astrogildo", 5)
    };

    public void listaClientes() {
        for (Cliente cli : clientes) {
            System.out.println("Cliente: " + cli.getNome() + " / " + "Matrícula: " + cli.getMatricula());
        }
    }
}
