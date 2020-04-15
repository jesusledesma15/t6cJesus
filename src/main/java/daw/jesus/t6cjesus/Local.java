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
public class Local extends Policia {

    private String arma;
    private String coche;
    private String Localidad;
    private int numEmergencia;

    public Local(String arma, String coche, String Localidad, int numEmergencia, int nPlaca, LocalDate inicio, String nombre, String apellidos, String nif, int tlf) {
        super(nPlaca, inicio, nombre, apellidos, nif, tlf);
        this.arma = arma;
        this.coche = coche;
        this.Localidad = Localidad;
        this.numEmergencia = numEmergencia;
    }

    @Override
    public void multar(Persona p) {
        System.out.println("Policia Local multa a " + p.toString());
    }

    @Override
    public void circular() {
        System.out.println("Circulo por la calle como un policía Local");
    }

    public void custodiarEdificio(String edificio) {
        System.out.println("Custodiando edificio " + edificio);
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

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public int getNumEmergencia() {
        return numEmergencia;
    }

    public void setNumEmergencia(int numEmergencia) {
        this.numEmergencia = numEmergencia;
    }

    @Override
    public String toString() {
        return super.toString() + "arma=" + arma + ", coche=" + coche + ", Localidad=" + Localidad + ", numEmergencia=" + numEmergencia + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.arma);
        hash = 23 * hash + Objects.hashCode(this.coche);
        hash = 23 * hash + Objects.hashCode(this.Localidad);
        hash = 23 * hash + this.numEmergencia;
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
        final Local other = (Local) obj;
        if (this.numEmergencia != other.numEmergencia) {
            return false;
        }
        if (!Objects.equals(this.arma, other.arma)) {
            return false;
        }
        if (!Objects.equals(this.coche, other.coche)) {
            return false;
        }
        if (!Objects.equals(this.Localidad, other.Localidad)) {
            return false;
        }
        return true;
    }

}
