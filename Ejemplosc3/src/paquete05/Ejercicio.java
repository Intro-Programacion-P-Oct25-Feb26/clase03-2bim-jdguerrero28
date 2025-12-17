/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String[] empleados = new String[5];
        String[] estacion = new String[5];
        double[][] produccion = new double[5][12];
        double[] totales = new double[5];
        String lista = "";
        double suma;

        for (int i = 0; i < produccion.length; i++) {
            System.out.println("Ingrese el nombre del empleado:");
            empleados[i] = entrada.nextLine();
            System.out.println("Ingrese el nombre de la estacion:");
            estacion[i] = entrada.nextLine();
            for (int j = 0; j < produccion[i].length; j++) {
                System.out.printf("Ingrese la producción del mes %s",j+1);
                produccion[i][j] = entrada.nextDouble();
            }
        }
    }
}
