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
    
    
}
