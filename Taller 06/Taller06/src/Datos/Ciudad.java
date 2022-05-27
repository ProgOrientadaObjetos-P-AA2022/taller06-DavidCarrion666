/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author Usuario iTC
 */
public class Ciudad {

    private String nombre;
    private String provincia;

    public Ciudad(String n, String p) {
        nombre = n;
        provincia = p;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerProvincia() {
        return provincia;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerProvincia(String n) {
        provincia = n;
    }

}
