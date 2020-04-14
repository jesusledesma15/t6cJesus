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

    @Override
     public void circular(){
        System.out.println("Circulo por la calle como un policía");
    }
    
    public int getnPlaca() {
        return nPlaca;
    }

    public void setnPlaca(int nPlaca) {
        this.nPlaca = nPlaca;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    @Override
    public String toString() {
        return super.toString() + "nPlaca=" + nPlaca + ", inicio=" + inicio + '}';
    }
    
    
}
