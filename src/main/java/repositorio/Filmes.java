/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import com.mycompany.locadora.model.Filme;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author marcelo
 */
public class Filmes {

    private static final Filme[] filmes = {
        new Filme("Argo", "Romance", LocalDate.of(2018, Month.JULY, 15), new BigDecimal(6), 0),
        new Filme("Clube da Luta", "Aventura", LocalDate.of(2014, Month.MARCH, 6), new BigDecimal(8), 1),
        new Filme("Cidade de Deus", "Ação", LocalDate.of(2014, Month.APRIL, 1), new BigDecimal(12), 2),
        new Filme("Liga da Justiça", "Ação", LocalDate.of(2014, Month.SEPTEMBER, 30), new BigDecimal(4), 3),
        new Filme("Os Trapalhões", "Comédia", LocalDate.of(2014, Month.JUNE, 1), new BigDecimal(8), 4)
    };

    public Filme[] todos() {
        return filmes;
    }

    public Filme porCodigo(int codigo) {
        return filmes[codigo];
    }
}
