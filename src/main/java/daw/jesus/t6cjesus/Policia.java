/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.jesus.t6cjesus;

import java.time.LocalDate;
import java.util.Objects;

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
     
     public void multar(Persona p){
         System.out.println("Multando a " + p.toString());
     }
     
     public void renovarPlaca(int nueva){
         setnPlaca(nueva);
         System.out.println("Policía ha renovado su placa");
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.nPlaca;
        hash = 37 * hash + Objects.hashCode(this.inicio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
 
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        if(!super.equals(obj)){
            return false;
        }
        final Policia other = (Policia) obj;
        if (this.nPlaca != other.nPlaca) {
            return false;
        }
        if (!Objects.equals(this.inicio, other.inicio)) {
            return false;
        }
        return true;
    }
    
    
}
