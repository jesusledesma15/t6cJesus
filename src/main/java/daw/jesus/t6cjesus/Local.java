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
    public void circular() {
        System.out.println("Circulo por la calle como un policía Local");
    }

    public void custodiarEdificio(String edificio){
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

}
