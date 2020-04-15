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
public class Prueba {
    
    public static void main(String[] args) {
         
        Persona a1 = new Persona("Jesus", "Ledesma", "09174185J", 684124156);
        Persona a2 = new Persona("Mari", "Rodriquez","89541512L", 685148541);
        
        Policia b1 = new Policia(15145452, LocalDate.of(1985, 6, 12), "Ramon", "Garcia", "51215415R", 632564154);
        Policia b2 = new Policia(85485414, LocalDate.of(1980, 3, 3), "Pilar", "Gomez", "150521514C", 645158548);
        
        Local c1 = new Local("Porra", "Citroen c5", "Estepona", 91, 54154554, LocalDate.of(1975, 5, 10), "Jose", "Cano", "2626262Y", 659019898);
        Local c2 = new Local("Pistola", "Citroen c4", "Manilva", 91,52564541, LocalDate.of(1979, 10, 11), "Ivan", "Campo", "3626262J",634212030);
        
        Nacional d1 = new Nacional("Fusil hk33", "Toyota Prius+", "España", 92,72564541, LocalDate.of(1970, 5, 8), "Juan", "Vargas", "41854413J",681232111);
        Nacional d2 = new Nacional("Fusil hk33", "Citroen Piccaso", "España", 92,92564541, LocalDate.of(1970, 5, 8), "Raquel", "Murillo", "33854413J",661232161);
    }
    
}
