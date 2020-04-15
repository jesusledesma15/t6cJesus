/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.jesus.t6cjesus;

import java.util.Objects;

/**
 *
 * @author Jesus
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private String nif;
    private int tlf;

    public Persona(String nombre, String apellidos, String nif, int tlf) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.tlf = tlf;
    }

    public void circular() {
        System.out.println("Circulo por la calle como persona");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", tlf=" + tlf + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nombre);
        hash = 11 * hash + Objects.hashCode(this.apellidos);
        hash = 11 * hash + Objects.hashCode(this.nif);
        hash = 11 * hash + this.tlf;
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
        final Persona other = (Persona) obj;
        if (this.tlf != other.tlf) {
            return false;
        }

        if (!Objects.equals(this.nif, other.nif)) {
            return false;
        }
        return true;
    }

}
