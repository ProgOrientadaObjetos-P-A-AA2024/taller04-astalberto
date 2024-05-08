/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 * Los profesores de un instituto tienen algunas características: nombre,
 * apellido, sueldo básico, sueldo total y cédula. El sueldo total es igual al
 * sueldo básico más el 20% del sueldo básico.
 *
 * @author utpl
 */
public class Profesores {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;

    public Profesores(String n, String a, String c) {
        nombre = n;
        apellido = a;
        cedula = c;
        sueldoBasico = 1500;
    }

    public Profesores(double sueldo) {
        nombre = "Pedro";
        apellido = "Picapiedra";
        cedula = "1011011010";
        sueldoBasico = sueldo;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerApellido(String x) {
        apellido = x;
    }

    public void establecerCedula(String x) {
        cedula = x;
    }

    public void establecerSueldoBasico(double n) {
        sueldoBasico = n;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.2);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        return String.format("""
                             -------------------------------
                             Profesor
                             Nombres %s %s
                             Cedula: %s
                             Sueldo Basico: %.2f
                             Sueldo Total: %.2f
                             -------------------------------
                             """, 
                nombre, 
                apellido,
                cedula,
                sueldoBasico, 
                sueldoTotal);
    }

}
