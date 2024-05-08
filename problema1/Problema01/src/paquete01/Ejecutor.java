/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import paquete02.LibretaNotas;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    public static void main(String[] args) {
        LibretaNotas libretaNotas1 = new LibretaNotas("Maria");
        LibretaNotas libretaNotas2 = new LibretaNotas(9.870, 8.100, 7.780);

        libretaNotas1.calcularPromedio();
        libretaNotas2.calcularPromedio();

        System.out.printf("%s", libretaNotas1);
        System.out.printf("%s", libretaNotas2);
    }
}
