/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author Usuario iTC
 */
public class Medico {

    private String nombre;
    private String especialidad;
    private double sueldo;

    public Medico(String n, double s, String e) {
        nombre = n;
        especialidad = e;
        sueldo = s;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerEspecialidad(String n) {
        especialidad = n;
    }

    public void establecerSueldo(double n) {
        sueldo = n;
    }

}
