/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.jesus.t6cjesus;

/**
 *
 * @author Jesus
 */
public class Nacional {
    
    private String arma;
    private String coche;
    private String pais;
    private int numEmergencia;

    public Nacional(String arma, String coche, String pais, int numEmergencia) {
        this.arma = arma;
        this.coche = coche;
        this.pais = pais;
        this.numEmergencia = numEmergencia;
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
    
    
}
