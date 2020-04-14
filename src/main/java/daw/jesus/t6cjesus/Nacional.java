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

}
