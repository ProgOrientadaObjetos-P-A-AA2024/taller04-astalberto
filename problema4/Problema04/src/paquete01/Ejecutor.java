/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete02.Cheques;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cheques cheque01 = new Cheques(200);
        Cheques cheque02 = new Cheques("Juana Fernanda", "Banco de Loja",
                500);
        cheque01.calcularComisionBanco();
        cheque02.calcularComisionBanco();
        System.out.printf("%s", cheque01);
        System.out.printf("%s", cheque02);
    }

}
