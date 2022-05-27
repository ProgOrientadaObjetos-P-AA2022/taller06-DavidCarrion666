/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller06;

import Datos.Medico;
import Datos.Ciudad;
import Datos.Enfermeros;
import Datos.Hospitales;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Medico[] medicos;
        Enfermeros[] enfermeros;

// ----------------------------------------------------------------------------

        System.out.println("Ingrese el nombre de la entidad hospitalaria");
        String hospital = entrada.nextLine();
        System.out.println("Ingrese la direccion de la entidad hospitalaria");
        String direccion = entrada.nextLine();
        System.out.println("Ingrese el nombre de la ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de la provincia");
        String provincia = entrada.nextLine();

        Ciudad c1 = new Ciudad(ciudad, provincia);

// ----------------------------------------------------------------------------  

        System.out.println("Ingrese el numero de médicos que tiene la entidad "
                + "hospitalaria");
        int numeroMedicos = entrada.nextInt();

        medicos = new Medico[numeroMedicos];
        entrada.nextLine();

        for (int i = 0; i < numeroMedicos; i++) {

            System.out.println("Ingrese el nombre del médico");
            String nombreMedico = entrada.nextLine();
            System.out.println("Ingrese el sueldo que recibe el medico");
            double sueldoMedico = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese la especialidad del medico");
            String especialidad = entrada.nextLine();

            Medico m1 = new Medico(nombreMedico, sueldoMedico, especialidad);

            medicos[i] = m1;
        }
// ----------------------------------------------------------------------------

        System.out.println("Ingrese el número de enfermeros(as)");
        int numeroEnfermeros = entrada.nextInt();
        enfermeros = new Enfermeros[numeroEnfermeros];

        entrada.nextLine();

        for (int i = 0; i < numeroEnfermeros; i++) {
            System.out.println("Ingrese el nombre del enfermero(a)");
            String nombreEnfermero = entrada.nextLine();
            System.out.println("Ingrese el sueldo que recibe el enfermero(a)");
            double sueldoEnfermero = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese el tipo de contrato que tiene el "
                    + "enfermero(a)");
            String contrato = entrada.nextLine();

            Enfermeros e1 = new Enfermeros(nombreEnfermero, sueldoEnfermero,
                    contrato);

            enfermeros[i] = e1;

        }
        int numeroEspecialidades = numeroMedicos + numeroEnfermeros;
        
// ---------------------------------------------------------------------------- 

        Hospitales entidadHospitalaria = new Hospitales(
                hospital,
                direccion, 
                c1, 
                numeroEspecialidades, 
                medicos, 
                enfermeros);
        
        entidadHospitalaria.calcularSueldo();

        System.out.printf("\n%s\n", entidadHospitalaria);
    }

}
