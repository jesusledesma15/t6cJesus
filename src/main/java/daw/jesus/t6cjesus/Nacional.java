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
public class Nacional extends Policia {

    private String arma;
    private String coche;
    private String pais;
    private int numEmergencia;

    public Nacional(String arma, String coche, String pais, int numEmergencia, int nPlaca, LocalDate inicio, String nombre, String apellidos, String nif, int tlf) {
        super(nPlaca, inicio, nombre, apellidos, nif, tlf);
        this.arma = arma;
        this.coche = coche;
        this.pais = pais;
        this.numEmergencia = numEmergencia;
    }

    @Override
    public void multar(Persona p){
        System.out.println("Policia Nacional multa a " + p.toString());
    }
    
    @Override
    public void circular() {
        System.out.println("Circulo por la calle como un policía Nacional");
    }

    public void renovarNif(Persona persona) {
        System.out.println("Su nif " + persona.getNif() + " ha sido renovado");

    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getCoche() {
        return coche;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumEmergencia() {
        return numEmergencia;
    }

    public void setNumEmergencia(int numEmergencia) {
        this.numEmergencia = numEmergencia;
    }

    @Override
    public String toString() {
        return super.toString() + " arma=" + arma + ", coche=" + coche + ", pais=" + pais + ", numEmergencia=" + numEmergencia + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.arma);
        hash = 29 * hash + Objects.hashCode(this.coche);
        hash = 29 * hash + Objects.hashCode(this.pais);
        hash = 29 * hash + this.numEmergencia;
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
        final Nacional other = (Nacional) obj;
        if (this.numEmergencia != other.numEmergencia) {
            return false;
        }
        if (!Objects.equals(this.arma, other.arma)) {
            return false;
        }
        if (!Objects.equals(this.coche, other.coche)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }

    
    
}
