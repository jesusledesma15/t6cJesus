/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.jesus.t6cjesus;

import java.time.LocalDate;

/**
 *
 * @author Jesus
 */
public class Policia extends Persona{
    
    private int nPlaca;
    private LocalDate inicio;

    public Policia(int nPlaca, LocalDate inicio, String nombre, String apellidos, String nif, int tlf) {
        super(nombre, apellidos, nif, tlf);
        this.nPlaca = nPlaca;
        this.inicio = inicio;
    }
    
    
}
