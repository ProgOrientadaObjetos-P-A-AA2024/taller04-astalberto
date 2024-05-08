/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 * Se requiere representar una entidad que permita crear objetos con
 * características como: nombre de estudiante, calificación de materia 1,
 * calificación de materia 2, calificación de materia 3 y promedio de
 * calificaciones.
 *
 * @author utpl
 */
public class LibretaNotas {

    private String nombre;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promedio;

    public LibretaNotas(String name) {
        nombre = name;
        calificacionMateria1 = 8.737;
        calificacionMateria2 = 7.500;
        calificacionMateria3 = 9.000;

    }

    public LibretaNotas(double n1, double n2, double n3) {
        nombre = "Pedro";
        calificacionMateria1 = n1;
        calificacionMateria2 = n2;
        calificacionMateria3 = n3;

    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerCalificacionMateria1(double n) {
        calificacionMateria1 = n;
    }

    public void establecerCalificacionMateria2(double n) {
        calificacionMateria2 = n;
    }

    public void establecerCalificacionMateria3(double n) {
        calificacionMateria3 = n;
    }

    public void calcularPromedio() {
        promedio = (calificacionMateria1 + calificacionMateria2 + calificacionMateria3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerCalificacionMateria1() {
        return calificacionMateria1;
    }

    public double obtenerCalificacionMateria2() {
        return calificacionMateria2;
    }

    public double obtenerCalificacionMateria3() {
        return calificacionMateria3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {

        String cadena = String.format("""
                             -------------------------------         
                             Libreta de Calificaciones         
                             Nombre: %s
                             Calificacion 1: %.3f
                             Calificacion 2: %.3f
                             Calificacion 3: %.3f
                             Promedio: %.2f
                             -------------------------------\n""",
                nombre, calificacionMateria1,
                calificacionMateria2,
                calificacionMateria3,
                promedio);
        return cadena;
    }
}
