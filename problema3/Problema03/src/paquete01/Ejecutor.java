/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete02.Automotor;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automotor auto1 = new Automotor();
        Automotor auto2 = new Automotor("1931328120", "Kia", 2022, 50000);
        auto1.calcularValorMatricula();
        auto2.calcularValorMatricula();
        System.out.printf("%s", auto1);
        System.out.printf("%s", auto2);
    }

}
