/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author utpl
 */
import paquete02.Profesores;

public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesores profesor1 = new Profesores(1270);
                profesor1.calcularSueldoTotal();
        Profesores profesor2 = new Profesores("Maria", "Martinez", "1700120101");
        profesor2.calcularSueldoTotal();
        
        System.out.printf("%s",profesor1);
        System.out.printf("%s",profesor2);
    }

}
