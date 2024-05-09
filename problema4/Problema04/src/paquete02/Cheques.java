/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author alber
 */
public class Cheques {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Cheques(double vC){
        nombreCliente = "Esteban Quito";
        nombreBanco= "Banco Nacional";
        valorCheque=vC;
    }
    public Cheques(String nC,String nB, double vC){
        nombreCliente = nC;
        nombreBanco= nB;
        valorCheque=vC;
    }
    
    public void establecerNombreCliente(String x) {
        nombreCliente = x;
    }

    public void establecerNombreBanco(String x) {
        nombreBanco = x;
    }

    public void establecerValorCheque(double n) {
        valorCheque = n;
    }

    public void calcularComisionBanco() {
        comisionBanco = (valorCheque * 0.003) / 100;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComisionBanco() {
        return comisionBanco;
    }

    @Override
    public String toString() {
        String cadena = String.format("Cheque\nNombre del Cliente: %s\n"
                + "Nombre del Banco: %s\nValor del Cheque: %.2f\n"
                + "Comision del Banco: %.3f\n",
                nombreCliente,
                nombreBanco,
                valorCheque,
                comisionBanco);
        return cadena;
    }

}
